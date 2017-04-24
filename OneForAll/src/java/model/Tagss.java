
package model;

import java.sql.*;
import java.util.*;

public class Tagss{
    
    protected static int tagID;
    private String tagname;
    private static int listTagID;

    public List<Tagss> listTag(){
        
        List<Tagss> listTags=null;
        try{
            Connection con=ConnectionBuilder.getConnection();
            String sql="select * from Tag ";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Tagss l =new Tagss();
                l.setTagID(rs.getInt(tagID));
                l.setTagname(rs.getString(tagname));
                 if(listTags==null){
                    listTags=new ArrayList<>();
                }
                listTags.add(l);
            
            }
        }catch(SQLException e){
            System.out.println(e);
        }return listTags;
    }
        public static String insertTag(int tagID,String tagname){
            String status;
            try{
                 Connection con=ConnectionBuilder.getConnection();
                 String sqlSelect="Select * from Tag";
                 PreparedStatement ps=con.prepareStatement(sqlSelect);
                 ps.setInt( 1 ,tagID);
                 ps.setString( 2 ,tagname);
                 ResultSet rs=ps.executeQuery();
                 while(rs.next()){
                 if(tagname.equals(rs.getString("tagName"))){
                     
                      listTagID=rs.getInt(tagID);
                }
                 }
                 String sql="INSERT INTO TAG VALUE(?,?)";
                 PreparedStatement ps2=con.prepareStatement(sql);
                 ps2.setInt( 1 ,tagID);
                 ps2.setString( 2 ,tagname);
                 int result = ps2.executeUpdate();
                 status = "complete";
                 
            }catch(SQLException e){
                status = "Incomplete";
                System.out.println(e);
            }
            return status;
        }
    
    public int getTagID() {
        return tagID;
    }

    public void setTagID(int tagID) {
        this.tagID = tagID;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

   

    
}
