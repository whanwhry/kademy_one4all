
package model;
    import java.sql.*;
    import java.util.*;

public class File_Tag {
   
    private int tagID;
    //file id มี tag id อะไรบ้างเรียกออกมาให้มด
    public String gettagID(int tagID){
        String status ;
        Connection con = ConnectionBuilder.getConnection();
        
        
        return null;
        
    }

    public int getTagID() {
        return tagID;
    }

    public void setTagID(int tagID) {
        this.tagID = tagID;
    }
    
}
