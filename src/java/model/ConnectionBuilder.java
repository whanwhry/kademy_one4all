/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection con = null;
        try { //tryเพราะ อิข้างล่างอาจมีสิ่งผิดปกติ
            Class.forName("com.mysql.jdbc.Driver");// 1 Load Driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcount", "root", ""); //ตัวจัดการไดเวอร์ ให้connnect
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return con;
    }

    public static void main(String[] args) { //check that are connected 
        Connection con = getConnection();
        System.out.println("Complete");
    }
}

