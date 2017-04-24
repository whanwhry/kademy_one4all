
package model;


    import java.sql.*;

    
public class ConnectionBuilder {
    public static Connection getConnection(){
        
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kademy","root","");
        
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException e) {
            System.out.println(e);
            
        }

        return con;
    }
    public static void main(String[]arg){
        Connection con=getConnection();
        System.out.println("Connection Complete");
    }
}
