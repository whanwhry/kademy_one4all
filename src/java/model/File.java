package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nunnnunns
 */
public class File {

    private String fileName, detail;
    private Time t;
    private int downloadRate, capacity;
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

    @Override
    public String toString() {
        return "File{" + "fileName=" + fileName + ", detail=" + detail
                + ", t=" + t + ", downloadRate=" + downloadRate
                + ", stID=" + stID + ", capacity=" + capacity + '}';
    }

    public static List<File> findByName(String name) {//สร้างmethodเป็นอาเรย์ลิส
        List<File> cl = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from file where fileName like ?"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, "%" + name + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                File cus = new File();
                cus.setFileName(rs.getString("fileName"));
                cus.setDetail(rs.getString("detail"));
                cus.setStID(rs.getLong("stID"));
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

    public static void main(String[] args) {

        File f = new File();
        List<File> cc = findByName("int105");//ทดลองหาชื่อ
        for (int i = 0; i <= cc.size() - 1; i++) {
            System.out.println(cc.get(i).getFileName());
        }

    }
}
