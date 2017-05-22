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

    private String username;
    private int  type , userId;
    private String name, surName, password;
    private static String msg;

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(String username,String name, String surName, String password) {
        this.username = username;
        
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        Users u = getUserIdSession("admin", "123456");
        System.out.println(u.getUserId());
    }
    public static Users getUserIdSession(String username, String password){
         Users Id = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from user where username like ? and password like ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);           
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Id = new Users();
                Id.setUserId(rs.getInt("userId"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return Id;
    }
    public static Users checkType(String username) {
        Users typeId = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select Type from user where username like ?";
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

    public boolean logIn(String username, String password) {
        boolean result = false;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select username,password from user where username = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();//ดึงข้อมูลจากDBมาเก็บในนี้แล้วเอาไปทำอะไรต่อ 
            if (rs.next()) {
                Users us = new Users();
                us.setPassword(rs.getString("password"));
                us.setUsername(rs.getString("username"));
                result = true;
            } else {
                msg = "Username or Password is incorrect.";
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;

    }

}

