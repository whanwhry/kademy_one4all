package model;

import java.io.File;
import java.sql.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static model.Tagss.tagID;

public class Files extends Tagss {

    private static int fileID;
    private String fileName;
    private String detail;
    private String path;
    private String time;
    private double capacity;
    private long userId;
    private int downloadCount;
    private static int numCount = 0;
    private Tagss tags;

    // method insertFile ขึ้น database ให้ส่ง filename detail(หัวข้อไฟล์) capacity path และ tagname
    public static String insertFile(String fileName, String detail, double capacity, String path,String tagName) {
        String status;
        ArrayList<String> subTag = new ArrayList();
        ArrayList<Integer> subTagId = new ArrayList();
        tagName=tagName.replaceAll(",", " ");
        Scanner sc = new Scanner(tagName);
        while(sc.hasNext()){
            subTag.add(sc.next());
        }
        try {
            Connection con = ConnectionBuilder2.getConnection();
            String sql = "INSERT INTO File(fileName,detail,capacity,path) VALUE (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fileName);
            ps.setString(2, detail);
            ps.setDouble(3, capacity);
            ps.setString(4, path);
            int result = ps.executeUpdate();

            String sqlSelectFileID = "SELECT * from File where fileName = ?"; //ให้หา filename ในfile เพื่อหา fileid
            PreparedStatement ps1 = con.prepareStatement(sqlSelectFileID);
            ps1.setString(1, fileName);
            ResultSet select = ps1.executeQuery();

            int fileid = 0;
            while (select.next()) {
                fileid = select.getInt("fileID"); //นำ filename ที่ select ออกมา วนหา fileid
            }
            
            String selectTag = "SELECT * from Tag where tagName=?"; //ให้นำ tagname ใน file เพื่อนำไปหา tagid
            PreparedStatement ps2 = con.prepareStatement(selectTag);
            for(int i=0;i<subTag.size();i++){
                ps2.setString(1, subTag.get(i));
                ResultSet selectTags = ps2.executeQuery();
                while(selectTags.next()){
                    subTagId.add(selectTags.getInt("tagId"));
                }
            }
            
            String sql2 = "INSERT INTO file_Tag(fileID,tagID) VALUE(?,?)"; //ให้ส่งfileid tagid ขึ้นตารางใน file_tag 
            PreparedStatement ps3 = con.prepareStatement(sql2);
            for(int i=0;i<subTagId.size();i++){
                ps3.setInt(1, fileid);
                ps3.setInt(2,subTagId.get(i));
                ps3.executeUpdate();
            }
            
            status = "complete";
        } catch (SQLException e) {
            status = "incomplete";
            System.out.println(e);
        }
        subTag.clear();
        return status;
    }

    public String deleteFile(int fileID) {
        String status;
        try {
            Connection con = ConnectionBuilder2.getConnection();
            String sql = "DELETE FROM File WHERE FILEID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, fileID);
            int result = ps.executeUpdate();
            status = "Complete";
        } catch (SQLException e) {
            status = "incomplete";
            System.out.println(e);
        }
        return status;
    }

    public int numCount() {
        this.downloadCount = ++numCount;
        return downloadCount;
    }

    public static String getTimeDate() {
        Date d = new Date();
        DateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
        String f = fm.format(d);

        return f;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public static int getNumCount() {
        return numCount;
    }

    public static void setNumCount(int numCount) {
        Files.numCount = numCount;
    }

    public Tagss getTags() {
        return tags;
    }

    public void setTags(Tagss tags) {
        this.tags = tags;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Files() {
    }

    public void upload(File f) {
    }

}
