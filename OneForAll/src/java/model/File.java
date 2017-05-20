package model;

import java.nio.file.attribute.FileTime;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import static model.Tag.showTag;

/**
 *
 * @author nunnnunns
 */
public class File {

    private String fileName, detail, tagName;
    private Time t;
    private Date d;
    private int downloadRate, capacity, id;
    private long stID;

    public File() {
    }

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Time getT() {
        return t;
    }

    public void setT(Time t) {
        this.t = t;
    }

    public int getDownloadRate() {
        return downloadRate;
    }

    public void setDownloadRate(int downloadRate) {
        this.downloadRate = downloadRate;
    }

    public long getStID() {
        return stID;
    }

    public void setStID(long stID) {
        this.stID = stID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "File{" + "fileName=" + fileName + ", detail=" + detail + ", tagName=" + tagName + ", t=" + t + ", d=" + d + ", downloadRate=" + downloadRate + ", capacity=" + capacity + ", id=" + id + ", stID=" + stID + '}';
    }

    /*
    public static List<Object> findByName(String name) {//สร้างmethodเป็นอาเรย์ลิส
        List<Object> cl = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from file "
                     + "JOIN file_tag on file.fileID = file_tag.fileId "
                    + "join tag on tag.tagID = file_tag.tagId "              
                    + "where fileName like ? "
                    + "order by time DESC"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, "%" + name + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            int count=0;
            while (rs.next()) {//สร้างลูปหาชื่อ
                File ff = new File();
                Tag tag = new Tag();
                
                ff.setFileName(rs.getString("fileName"));
                ff.setDetail(rs.getString("detail"));
                ff.setStID(rs.getLong("stID"));
                ff.setT(rs.getTime("time"));
                ff.setD(rs.getDate("time"));
                ff.setId(rs.getInt("fileId"));
                tag.setTagName(rs.getString("tagName"));
                 ff.setTagName(rs.getString("tagName"));

                if (cl == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    cl = new ArrayList<>();
                }
                if(count==0){
                    cl.add(ff);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
                }
                count++;
                cl.add(tag);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return cl;
    }*/
    public static List<File> findByName(String name) {//สร้างmethodเป็นอาเรย์ลิส
        List<File> cl = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
                String sql = "select * from file where fileName like ?"
                    + " order by time DESC";//ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, "%" + name + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                File cus = new File();
                cus.setFileName(rs.getString("fileName"));
                cus.setDetail(rs.getString("detail"));
                cus.setStID(rs.getLong("userId"));
                cus.setT(rs.getTime("time"));
                cus.setD(rs.getDate("time"));
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

    public static List<File> listFileByTime() {//สร้างmethodเป็นอาเรย์ลิส
        List<File> newest = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        String fileN = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from tag "
                    + "JOIN file_tag on tag.tagID = file_tag.tagId "
                    + "join file on file.fileID = file_tag.fileId "
                    + " order by time DESC";//ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                File lfbt = new File();
                lfbt.setFileName(rs.getString("fileName"));
                lfbt.setDetail(rs.getString("detail"));
                lfbt.setStID(rs.getLong("stID"));
                lfbt.setT(rs.getTime("time"));
                lfbt.setD(rs.getDate("time"));  
                lfbt.setTagName(rs.getString("tagName"));
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

//    public static List<File> listTimeWithTag(String tagtime) {//สร้างmethodเป็นอาเรย์ลิส
//        List<File> tag = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
//        try {
//           
//                Connection con = ConnectionBuilder.getConnection();
//                String sql = "select * from tag "
//                        + "JOIN file_tag on tag.tagID = file_tag.tagId "
//                        + "join file on file.fileID = file_tag.fileId "
//                        + "where fileName like ? "
//                        + "order by time DESC";//ใช้ภาษาsqlหาชื่อ
//                PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
//                st.setString(1, tagtime);//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
//                ResultSet rs = st.executeQuery();
//                while (rs.next()) {//สร้างลูปหาชื่อ
//                    File tt = new File();
//                    tt.setTagName(rs.getString("tagName"));
//                    if (tag == null) {//ถ้าไม่เจอให่สร้างอาเรย์
//                        tag = new ArrayList<>();
//                    }
//                    tag.add(tt);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
//                }
//          
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return tag;
//    }

    /* public static List<File> listFileByTime() {
        List<File> file = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from file "
                    + "JOIN file_tag on file.fileID  = file_tag.fileId "
                    + "join tag on tag.tagID = file_tag.tagId "
                    + " order by time DESC";
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                File lf = new File();

                lf.setFileName(rs.getString("fileName"));
                lf.setDetail(rs.getString("detail"));
                lf.setStID(rs.getLong("stID"));
                lf.setT(rs.getTime("time"));
                lf.setD(rs.getDate("time"));
               
                if (file == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    file = new ArrayList<>();

                }
                file.add(lf);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return file;
    }*/
    public static void main(String[] args) {

        File f = new File();
        List<File> cc = listFileByTime();//ทดลองหาชื่อ
        for (int i = 0; i <= cc.size() - 1; i++) {
            System.out.println(cc.get(i));
        }
        System.out.println("----------------");

        File cl = new File();
        List<File> kk = findByName("int107");//ทดลองหาชื่อ
        for (int i = 0; i <= kk.size() - 1; i++) {
            System.out.println(kk.get(i));
        }
        System.out.println("------------------");
        
    }
}
