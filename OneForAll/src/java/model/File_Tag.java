
package model;
    import java.sql.*;
    import java.util.*;

public class File_Tag extends Files {
   
    private int tagID;
    //file id มี tag id อะไรบ้างเรียกออกมาให้มด
    public String gettagID(int tagID){
        String status="in" ;
        ArrayList<Tagss> listTags =new ArrayList();
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from File_Tag "+"JOIN TAG ON FILE_TAG.TAGNAME=Transaction.TAGNAME"+"WHERE NOT Transaction.action='Return'AND Transaction.fileID=80";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tagss l = new Tagss();

                l.setTagname(rs.getString(tagID));
                if (listTags == null) {
                    listTags = new ArrayList<>();
                }
                listTags.add(l);

            }
        } catch (SQLException e) {
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
    public static void main(String[]args){
        System.out.println();
    }
}
