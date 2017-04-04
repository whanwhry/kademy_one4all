/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nunnnunns
 */
public class Tag {
    private String tagName,description;

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
    public static List<Tag> findByTag(String tags) {//สร้างmethodเป็นอาเรย์ลิส
        List<Tag> tag = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from tag where tagname like ?"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            st.setString(1,tags + "%");//ใช้"%"เพื่อที่หลังจากตัวอักษรที่หาจะเป็นอะไรก็ได้
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปหาชื่อ
                Tag cus = new Tag();
                
                cus.setTagName(rs.getString("name"));
                if (tag == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    tag = new ArrayList<>();

                }
                tag.add(cus);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return tag;
    }

    public static void main(String[] args) {
        
        
        List<Tag> cc = findByTag("J");//ทดลองหาชื่อจากตัวอักษรตัว J
        System.out.println(cc);
    }
}
