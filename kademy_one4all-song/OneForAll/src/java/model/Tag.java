
package model;

import java.sql.*;
import java.util.*;

public class Tag {
    private int tagID;
    private String tagname;
    
    public List<Tag> listTag(){
        
        List<Tag> listTags=null;
        try{
            Connection con=ConnectionBuilder.getConnection();
            String sql="select * from Tag ";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Tag l =new Tag();
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
        public String insertTag(String tagname){
            String status;
            try{
                 Connection con=ConnectionBuilder.getConnection();
                 String sql="INSERT INTO TAG VALUE(?,?)";
                 PreparedStatement ps=con.prepareStatement(sql);
                 ps.setInt( 1 ,tagID);
                 ps.setString( 2 ,tagname);
                 int result = ps.executeUpdate();
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
