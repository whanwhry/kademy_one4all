/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTOON
 */
import java.sql.*;
import java.util.*;

public class Customer {

    private int id;
    private String name;
    private String city;
    private String state;

    public static List<Customer> findByName(String name) {
        List<Customer> customers = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from customer where name like ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString( 1 , "%"+name+"%");
            // Statement st = con.createStatement();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setCity(rs.getString("city"));
                c.setState(rs.getString("state"));
                if(customers == null){
                    customers = new ArrayList<>();
                }
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
            Connection con = ConnectionBuilder.getConnection();  // Load driver + Connect 
            String sql = "select * from customer where customer_id = " + id;
            Statement st = con.createStatement();  // make Query
            ResultSet rs = st.executeQuery(sql);  // execute
            if (rs.next()) {
                c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setCity(rs.getString("city"));
                c.setState(rs.getString("state"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return c;
    }

    public static void main(String[] args) {
       List<Customer> cc = findByName("a");
       for(Customer c : cc){
           System.out.println(c.getName());
       }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
