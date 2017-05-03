package model;

import java.sql.*;
import java.util.*;

public class Tagss {

    protected static int tagID;
    private String tagname;
    private static int listTagID;
    static String subTag;
    static String subTag2;
    
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

    public static void main(String[] args) {
        String s = "ff,fame,zafsd";
        int j = 0;
        int k = s.indexOf(",", 10);
        System.out.println(k);
        for (int i = 0; i < s.length(); i++) {
            j = s.indexOf(",", i);
            if (i > j) {
                String sub = s.substring(i);
                System.out.println(sub);
                break;
            } else {
                String sub = s.substring(i, j);
                System.out.println(sub);
                System.out.println(j);
                i = j;
            }
        }
        String a = insertTag(s);
    }

    public static String insertTag(String tagname) {
        String status = "";
        int col = 0;
        int index = 0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sqlSelect = "Select * from Tag";
            PreparedStatement ps = con.prepareStatement(sqlSelect);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (tagname.equals(rs.getString("tagName"))) {
                    Tagss l = new Tagss();
                    l.setTagname(rs.getString(tagname));
                    //listTagID = rs.getInt(tagID);
                }
            }
            for (index = 0; index < tagname.length(); index++) {
                col = tagname.indexOf(",", index);
                if (index > col) {
                    subTag = tagname.substring(index);
                    String sql = "INSERT INTO tag (tagName) VALUES (?)";
                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ps2.setString(1, subTag);
                    int result = ps2.executeUpdate();
                    status = "complete";
                    break;
                } else {
                    subTag = tagname.substring(index, col);
                    index = col;
                }
                    String sql = "INSERT INTO tag (tagName) VALUES (?)";
                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ps2.setString(1, subTag);
                    int result = ps2.executeUpdate();
                    status = "complete";
                
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
