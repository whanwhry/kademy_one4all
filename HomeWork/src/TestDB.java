/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestDB {

    public static void main(String[] args) {
        try {
            //1.ทำการโหลด Driver
            //2.Establishing connections
            //3.สร้าง statement

            Connection conn = MyDBConnection.conn4me();
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/srk_shop", "app", "app");

            Statement statement = conn.createStatement();
            //statement.executeUpdate ("INSERT INTO product VALUES (99,'Bag',3000)");

            String strSQL = "UPDATE product SET Price=? WHERE product_id=?";
            PreparedStatement statement2 = conn.prepareStatement(strSQL);
            statement2.setDouble(1, 500);
            statement2.setInt(2, 99);
            statement2.executeUpdate();

            ResultSet rs = statement.executeQuery("SELECT * FROM product");

            while (rs.next()) {
                System.out.println("No : "+rs.getInt("product_id") + "\t");
                System.out.println("Name : "+rs.getString("product_name") + "\t");
                System.out.println("Price : "+rs.getDouble("price"));
                System.out.println("--------------------------------");
            }

            conn.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("!!! " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("!!! " + ex.getMessage());
        }

    }
}
