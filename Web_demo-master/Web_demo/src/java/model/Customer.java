/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FirstZa
 */
public class Customer {

    private int customerId;
    private String name;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Customer> findByName(String name) {
        List<Customer> customers = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from customer where lower(name) like ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, "%"+name.toLowerCase()+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                if(customers == null){
                    customers = new ArrayList<>();
                }
                Customer c = new Customer();
                c.setCustomerId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                customers.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customers;
    }
    
    
    
    public static Customer findById(int id) {
        Customer c = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from customer where customer_id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                c = new Customer();
                c.setCustomerId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return c;
    }
    
    public static void main(String[] args) {
        Customer c = Customer.findById(1);
        System.out.println(c.getName());
    }

}
