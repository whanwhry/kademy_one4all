package model;

import java.sql.*;
import java.util.*;
import java.io.*;

public class Tagss {

    protected static int tagID;
    private String tagname;
    private static int listTagID;

    public List<Tagss> listTag() {

        List<Tagss> listTags = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from Tag ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tagss l = new Tagss();

                l.setTagname(rs.getString(tagname));
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

    public static String insertTag(String tagname) {
        String[] subTag = null;
        String status = "";
        int col = 0;
        int index = 0;
        try {
            subTag=tagname.split(",");
            for (int i = 0; i < subTag.length; i++) {
                System.out.println("tag = "+ subTag[i]);
                System.out.println("[before]subTag = "+subTag[i]);
            }
            Connection con = ConnectionBuilder.getConnection();
            String sqlchecktag = "Select * from tag where tagname=?";
            PreparedStatement ps1 = con.prepareStatement(sqlchecktag);
            for(int i=0;i<subTag.length;i++){
                ps1.setString(1, subTag[i]);
                ResultSet rs1 = ps1.executeQuery();
                int id = 0;
                if(rs1.next()){
                    subTag[i] = null;
                    id = rs1.getInt("tagId");
                }
            }
            //insert tag ที่ไม่ซ้ำลง db
            for (int j = 0; j <subTag.length; j++) {
                String sql = "INSERT INTO tag (tagName) VALUES (?)";
                PreparedStatement ps2 = con.prepareStatement(sql);
                if(subTag[j]!=null){
                    ps2.setString(1, subTag[j]);
                    int result = ps2.executeUpdate();
                    if(result > 0){
                        status = "complete";
                    }
                }  
            }
            for(int i=0;i<subTag.length;i++){
                System.out.println("subTag = "+subTag[i]);
            }
        } catch (SQLException e) {
            status = "Incomplete";
            System.out.println(e);
        }
        return status;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

}
