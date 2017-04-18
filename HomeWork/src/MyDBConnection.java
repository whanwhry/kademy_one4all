/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT105
 */
public class MyDBConnection {

    public static Connection conn4me() {
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/srk_shop", "app", "app");

        } catch (ClassNotFoundException ex) {
            System.out.println("!!! " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("!!! " + ex.getMessage());
        }
            return conn;
    }
}

