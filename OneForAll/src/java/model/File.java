package model;

import java.sql.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class File {

    private int fileID;
    private String fileName;
    private String detail;
    private String path;
    private String time;
    private String capacity;
    private long userId;
    private int downloadCount;
    private static int numCount=0;
    private Tag tags;

    public String insertFile(String fileName,String detail, String capacity) {
        String status;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO File(fileName,detail,capacity) VALUE(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fileName);
            ps.setString(2, detail);
            ps.setString(3, capacity);
            int result = ps.executeUpdate();
            status = "complete";
        } catch (SQLException e) {
            status = "incomplete";
            System.out.println(e);
        }
        return status;
    }

    public String deleteFile(int fileID) {
        String status;
        try {
            Connection con = ConnectionBuilder.getConnection();
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
    public int numCount(){
        this.downloadCount=++numCount;
        return downloadCount;
    }
    
    public static String getTimeDate(){
        Date d = new Date();
        DateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
        String f=fm.format(d);
        
        
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
        File.numCount = numCount;
    }

    public Tag getTags() {
        return tags;
    }

    public void setTags(Tag tags) {
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

  

   

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public File() {
    }

  
    
    public void upload(File f){}
   
    
    
}
