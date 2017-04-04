/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author FirstZa
 */
public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample",
                     "app", "app");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println("Complete ");
    }
}
