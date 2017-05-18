package model;

import java.sql.*;
import java.util.Properties;

public class ConnectionBuilder2 {

    public static Connection mainConnection = null;

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties property = new Properties();
            property.put("user", "root");
            property.put("password", "");
            property.put("useEncoding", "true");
            property.put("characterEncoding", "UTF-8");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kademy?useUnicode=yes&amp;characterEncoding=utf8", property);

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);

        }

        return con;
    }

    public static void main(String[] arg) {
        Connection con = getConnection();
        System.out.println("Connection Complete");
    }
}
