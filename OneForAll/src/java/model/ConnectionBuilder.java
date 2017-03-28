
package model;


    import java.sql.*;

    
public class ConnectionBuilder {
    public static Connection getConnection(){
        
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
        con=DriverManager.getConnection("jdbc:derby://sit-edu5.sit.kmutt.ac.th:8443/Kademy_db","i206259005","Sa_RagazefA4");
        
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
