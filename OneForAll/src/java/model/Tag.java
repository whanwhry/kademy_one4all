package model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tag {

    private String tagName, description;
    protected int tagId;

    public Tag() {
    }

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tag{" + "tagName=" + tagName + ", description=" + description + '}';
    }

    public static List<Tag> listTags() {
        List<Tag> tag = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from tag order by tagName ASC";
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Tag tt = new Tag();

                tt.setTagName(rs.getString("tagName"));
                if (tag == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    tag = new ArrayList<>();

                }
                tag.add(tt);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return tag;
    }

    public static List<Tag> findByTag(String tags) {//สร้างmethodเป็นอาเรย์ลิส
        List<Tag> tag = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from tag "
                    + "where tagName like ?"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, "%" + tags + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Tag tt = new Tag();

                tt.setTagName(rs.getString("tagName"));
                if (tag == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    tag = new ArrayList<>();

                }
                tag.add(tt);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return tag;
    }

    public List<Tag> listTag() {

        List<Tag> listTags = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from Tag ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tag l = new Tag();

                l.setTagName(rs.getString(tagName));
                if (listTags == null) {
                    listTags = new ArrayList<>();
                }
                listTags.add(l);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listTags;
    }

    public static List<Tag> showTag(String name) {//สร้างmethodเป็นอาเรย์ลิส
        List<Tag> tag = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from tag "
                    + "JOIN file_tag on tag.tagID = file_tag.tagId "
                    + "join file on file.fileID = file_tag.fileId "
                    + "where fileName like ?"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1, name);//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Tag tt = new Tag();

                tt.setTagName(rs.getString("tagName"));
                if (tag == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    tag = new ArrayList<>();

                }
                tag.add(tt);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return tag;
    }

    public static String insertTag(String tagname) {
        String[] subTag = null;
        String status = "";
        int col = 0;
        int index = 0;
        try {
            subTag = tagname.split(",");
            for (int i = 0; i < subTag.length; i++) {
                System.out.println("tag = " + subTag[i]);
                System.out.println("[before]subTag = " + subTag[i]);
            }
            Connection con = ConnectionBuilder.getConnection();
            String sqlchecktag = "Select * from tag where tagname=?";
            PreparedStatement ps1 = con.prepareStatement(sqlchecktag);
            for (int i = 0; i < subTag.length; i++) {
                ps1.setString(1, subTag[i]);
                ResultSet rs1 = ps1.executeQuery();
                int id = 0;
                if (rs1.next()) {
                    subTag[i] = null;
                    id = rs1.getInt("tagId");
                }
            }
            //insert tag ที่ไม่ซ้ำลง db
            for (int j = 0; j < subTag.length; j++) {
                String sql = "INSERT INTO tag (tagName) VALUES (?)";
                PreparedStatement ps2 = con.prepareStatement(sql);
                if (subTag[j] != null) {
                    ps2.setString(1, subTag[j]);
                    int result = ps2.executeUpdate();
                    if (result > 0) {
                        status = "complete";
                    }
                }
            }
            for (int i = 0; i < subTag.length; i++) {
                System.out.println("subTag = " + subTag[i]);
            }
        } catch (SQLException e) {
            status = "Incomplete";
            System.out.println(e);
        }
        return status;
    }

    public static void main(String[] args) {
        List<Tag> t = showTag("int105");
        System.out.println(t.size());
        for (int i = 0; i < t.size(); i++) {

            System.out.println(t.get(i).getTagName());
        }

    }
}
