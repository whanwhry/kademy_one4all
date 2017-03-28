/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KARTOON
 */
public class Users extends Student{
    private int ratingID;
    private String name,surName,password;

    public Users() {
    }

    public Users(int ratingID, String name, String password, long stID, int eduYear, String department) {
        super(stID, eduYear, department);
        this.ratingID = ratingID;
        this.name = name;
        this.password = password;
    } 

    public Users(String password, long stID) {
        super(stID);
        this.password = password;
    }
    

    public int getRatingID() {
        return ratingID;
    }

    public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
    public static boolean logIn(long stID,String password){
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select stID,password from Student join Users on Student.stID=User.stID where stID=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, stID);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();//ดึงข้อมูลจากDBมาเก็บในนี้แล้วเอาไปทำอะไรต่อ
            if(rs.next()){
                Users us = new Users();
                Student std = new Student();
                us.setPassword(rs.getString("password"));
                std.setStID(rs.getLong("stID"));
                if(stID==std.getStID()){
                    System.out.println("Login Successful!");
                }else {
                    System.out.println("Login Fail!");
                }
                    
             
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
        
    }
}
