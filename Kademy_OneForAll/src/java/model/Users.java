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
public class Users {

    private long stID;
    private int ratingID, type;
    private String name, surName, password;
    private static String msg;

    public Users() {
    }

    public Users(long stID, String password) {
        this.stID = stID;
        this.password = password;
    }

    public Users(long stID, int ratingID, String name, String surName, String password) {
        this.stID = stID;
        this.ratingID = ratingID;
        this.name = name;
        this.surName = surName;
        this.password = password;
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        Users.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getStID() {
        return stID;
    }

    public void setStID(long stID) {
        this.stID = stID;
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

    public static Users checkType(String username) {
        Users typeId = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select Type from Users where stID like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                typeId = new Users();
                typeId.setType(rs.getInt("Type"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return typeId;
    }

    public boolean logIn(long stID, String password) {
        boolean result = false;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select stID,password from Users where stID = ? and password = ?";
            String sql2 = "select stID from Users ";
            PreparedStatement ps = con.prepareStatement(sql);
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps.setLong(1, stID);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();//ดึงข้อมูลจากDBมาเก็บในนี้แล้วเอาไปทำอะไรต่อ 
            ResultSet rs2 = ps2.executeQuery();
            if (rs.next()) {
                Users us = new Users();
                us.setPassword(rs.getString("password"));
                us.setStID(rs.getLong("stID"));
                result = true;
            } else if (rs2.next()) {
                while (rs2.next()){
                    if(stID!=rs2.getLong("stID"));
                    result = false;
                }
                
                msg = "Username not found";
            } else {
                result = false;
                msg = "Incorrect password";
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;

    }

}
