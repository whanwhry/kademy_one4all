package model;

import java.sql.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class File {

    private int fileID;
    private String fileTitle;
    private String description;
    private String time;
    private String capacity;
    private long stID;
    private static int downloadCount;
    private Tag tags;

    public String insertFile(String fileTitle, String description, String capacity) {
        String status;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO File(fileTitle,description,capacity) VALUE(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fileTitle);
            ps.setString(2, description);
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

    public static String getTimeDate(){
        Date d = new Date();
        DateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
        String f=fm.format(d);
        
        
        return f;
    }
    
    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public long getStID() {
        return stID;
    }

    public void setStID(long stID) {
        this.stID = stID;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public File() {
    }
    
    @Override
    public String toString() {
        return "File{" + "fileID=" + fileID + ", fileTitle=" + fileTitle + ", description=" + description + ", time=" + time + ", capacity=" + capacity + ", stID=" + stID + ", downloadRate=" + downloadCount + ", tags=" + tags + '}';
    }
    public static void main(String []args){
        System.out.println(getTimeDate());
    }
    
}
