package model;

import java.io.File;
import java.io.InputStream;
import java.sql.*;
import java.util.Date;
import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import javax.servlet.http.Part;
import static model.Tagss.tagID;
import sun.net.www.content.audio.x_aiff;

public class Files extends Tagss {

    private static int fileID;
    private int filesID;
    private String fileName;
    private String detail;
    private String path;
    private String time;
    
    private long userId;
    
    private Tagss tags;
    private String tagName, surName;
    private Time t;
    private Date d;
    private String username;
   
    
    public static String insertFile(String fileName, String detail, InputStream is, String path, String tagName, int id) {
        String status;
        
        ArrayList<String> subTag = new ArrayList();
        ArrayList<Integer> subTagId = new ArrayList();
        tagName = tagName.replaceAll(",", " ");
        Scanner sc = new Scanner(tagName);
        while (sc.hasNext()) { //ดูว่ามัไหม เป็น method ของ Scanner return เป็น t f
            subTag.add(sc.next());
        }
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO file(fileName,detail,path, fileType , userId ) VALUE (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fileName);
            ps.setString(2, detail);
         
            ps.setString(3, path);
            ps.setBlob(4, is);
            ps.setInt(5, id);
            ps.executeUpdate();

            String sqlSelectFileID = "SELECT * from file where fileName = ? ORDER BY fileName DESC"; //ให้หา filename ในfile เพื่อหา fileid
            //เราใช้ ORDER BY "" DESC เพื่อแก้ปัญหา filename ซ้ำกัน มันจะนำอันล่าสุดที่เราต้องการที่จะ insert มาให้
            PreparedStatement ps1 = con.prepareStatement(sqlSelectFileID);
            ps1.setString(1, fileName);
            ResultSet select = ps1.executeQuery();

            int fileid = 0;
            if (select.next()) { //ดูว่ามีค่าไหม method next return เป็น t f ถ้า true จะเข้า
                fileid = select.getInt("fileId"); //นำ filename ที่ select ออกมา วนหา fileid
            }

            String selectTag = "SELECT * from tag where tagName=?"; //ให้นำ tagname ใน file เพื่อนำไปหา tagid
            PreparedStatement ps2 = con.prepareStatement(selectTag);
            for (int i = 0; i < subTag.size(); i++) {
                ps2.setString(1, subTag.get(i));
                ResultSet selectTags = ps2.executeQuery();
                while (selectTags.next()) {
                    subTagId.add(selectTags.getInt("tagId"));
                }
            }

            String sql2 = "INSERT INTO file_tag(fileId,tagId) VALUE(?,?)"; //ให้ส่งfileid tagid ขึ้นตารางใน file_tag 
            PreparedStatement ps3 = con.prepareStatement(sql2);
            for (int i = 0; i < subTagId.size(); i++) {
                ps3.setInt(1, fileid);
                ps3.setInt(2, subTagId.get(i));
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

    public static String deleteFile(int fileID) {
        String status;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "DELETE FROM file WHERE FILEID=?";
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

    public static List<Files> findByName(String name) {//สร้างmethodเป็นอาเรย์ลิส
        List<Files> cl = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from file "
                    + " join user on file.userId = user.userId "
                    + "where fileName like ? "
                    + " order by time DESC";//ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, "%" + name + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Files cus = new Files();
                cus.setFileName(rs.getString("fileName"));
                cus.setDetail(rs.getString("detail"));
                cus.setUsername(rs.getString("username"));
                cus.setT(rs.getTime("time"));
                cus.setD(rs.getDate("time"));
                cus.setFileID(rs.getInt("fileId"));
                if (cl == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    cl = new ArrayList<>();
                }
                cl.add(cus);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return cl;
    }

   
        
    public static List<Files> setTagList(int id){//bugs
        int count = 0;
        List<Files> a = new ArrayList<>();
        List<Files> rub = listFileByTime(id);     
        for (Files i : rub){
            if(a.size() == 0 ){   
                a.add(i);
            }else{
                
                for(Files i2 : a){
                    
                    if(i.getFileName().equals(i2.getFileName())){
                        
                        a.get(count).setAddTagName(i.getTagName());
                    }
                    count++;
                }
                
            a.add(i);    
            count = 0;
            }
           
        }
        return a;
    }
    public static void main(String[] args) {
        List<Files> l = listFileByTime(0);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getFilesID());
        }
        
    }
    public static List<Files> listFileByTime(int id) {//สร้างmethodเป็นอาเรย์ลิส
        List<Files> newest = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส

        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from file "
                    + "JOIN file_tag on file.fileID = file_tag.fileId "
                    + "join tag on tag.tagID = file_tag.tagId "
                    + "where userId = ? "   
                    + " order by time DESC";//ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Files lfbt = new Files();
                lfbt.setFileName(rs.getString("fileName"));
                lfbt.setDetail(rs.getString("detail"));
                lfbt.setT(rs.getTime("time"));
                lfbt.setD(rs.getDate("time"));
                lfbt.setTagName(rs.getString("tagName"));
                lfbt.setFilesID(rs.getInt("fileId"));
                
                if (newest == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    newest = new ArrayList<>();
                }
                newest.add(lfbt);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return newest;
    }

 

    

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void setAddTagName(String TagName) {
        this.tagName += ","+TagName;
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

 

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Time getT() {
        return t;
    }

    public void setT(Time t) {
        this.t = t;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public static int getTagID() {
        return tagID;
    }

    public static void setTagID(int tagID) {
        Tagss.tagID = tagID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFilesID() {
        return filesID;
    }

    public void setFilesID(int FilesID) {
        this.filesID = FilesID;
    }

    @Override
    public String toString() {
        return "Files{" + "FilesID=" + filesID + ", fileName=" + fileName + ", detail=" + detail + ", path=" + path + ", time=" + time + ", userId=" + userId + ", tags=" + tags + ", tagName=" + tagName + ", surName=" + surName + ", t=" + t + ", d=" + d + ", username=" + username + '}';
    }
    
    

    public Files() {
    }

    public void upload(File f) {
    }

    public static String extractFileName(Part part) {
        // form-data; name="file"; filename="C:\file1.zip"
        // form-data; name="file"; filename="C:\Note\file2.zip"
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                // C:\file1.zip
                // C:\Note\file2.zip
                String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
                clientFileName = clientFileName.replace("\\", "/");
                int i = clientFileName.lastIndexOf('/');
                // file1.zip
                // file2.zip
                return clientFileName.substring(i + 1);
            }
        }
        return null;
    }

  

}
