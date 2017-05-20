package model;

import java.sql.*;
import java.util.Properties;

public class ConnectionBuilder {

    public static Connection mainConnection = null;

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties property = new Properties();
            property.put("user", "newuser");
            property.put("password", "One4ALL");
            property.put("useEncoding", "true");
            property.put("characterEncoding", "UTF-8");//ทำให้เว็บเข้าใจภาษาไทยได้
            con = DriverManager.getConnection("jdbc:mysql://54.149.77.246:3306/Kademy_One4All?useUnicode=yes&amp;characterEncoding=utf8", property);
//54.213.76.163:3306/One4All
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
