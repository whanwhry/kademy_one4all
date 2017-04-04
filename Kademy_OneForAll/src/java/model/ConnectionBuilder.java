/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KARTOON
 */

import java.sql.*;

public class ConnectionBuilder {

    public static Connection getConnection() {
        // Method for Load and connect database
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");// 1 Load Driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root", ""); // 2 Connect 
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println("Complete");
    }
}
