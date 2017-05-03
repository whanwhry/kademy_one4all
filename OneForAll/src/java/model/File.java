package model;

import java.sql.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class File extends Tagss {

    private int fileID;
    private String fileName;
    private String detail;
    private String path;
    private String time;
    private String capacity;
    private long userId;
    private int downloadCount;
    private static int numCount=0;
    private Tagss tags;
    
    
    
    public static String insertFile(String fileName,String detail, String capacity,String path) {
        String status;
        int store=0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sqlSelectFileID="SELECT * from File";
            PreparedStatement ps1 = con.prepareStatement(sqlSelectFileID);
            ResultSet select=ps1.executeQuery();
            
            while(select.next()){
                 store=select.getInt("fileID");
            }
            
            String sql = "INSERT INTO File(fileName,detail,capacity,fileID,path) VALUE(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fileName);
            ps.setString(2, detail);
            ps.setString(3, capacity);
            ps.setInt(4,++store);
            ps.setString(5, path);
            int result = ps.executeUpdate();
            
            String sql2="INSERT INTO file_Tag(fileID,tagID) VALUE(?,?)"; //ให้ส่งfileid tagid ขึ้นตารางใน db 
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, store);
            ps2.setInt(2, tagID);
           
            int result2 =ps2.executeUpdate();
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
   
    public static void main(String[]args){
        
    }
    
}
