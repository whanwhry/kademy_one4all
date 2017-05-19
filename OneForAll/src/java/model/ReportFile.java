/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KARTOON
 */
public class ReportFile {

    private int fileID, reportID;
    private Blob fileBlob; //Blob เป็นกลุ่มของไฟล์ คล้ายๆ .rar
    private String fileName;

    public ReportFile() {

    }

    public ReportFile(int fileID, Blob fileBlob) {
        this.fileID = fileID;
        this.fileBlob = fileBlob;
    }

    public ReportFile(int fileID, int reportID) {
        this.fileID = fileID;
        this.reportID = reportID;
    }

    public ReportFile(String fileName, Blob fileBlob ) {
        this.fileBlob = fileBlob;
        this.fileName = fileName;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public Blob getFileBlob() {
        return fileBlob;
    }

    public void setFileBlob(Blob fileBlob) {
        this.fileBlob = fileBlob;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ReportFile{" + "fileID=" + fileID + ", reportID=" + reportID + ", fileBlob=" + fileBlob + '}';
    }

    public static List<ReportFile> listReportFile() {//สร้าง method เป็นอาเรย์ลิส
        List<ReportFile> rpf = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        Connection con = null;
        try {
            con = ConnectionBuilder.getConnection();
            String sql = "select * from reportfile"; //ใช้ภาษา sql ในการเรียกไฟล์จากตาราง reportfile
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งข้างบนให้สมบูรณ์
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปแสดงไฟล์ที่โดนรีพอร์ต
                ReportFile rf = new ReportFile();
                rf.setFileID(rs.getInt("fileID"));

                if (rpf == null) {//ถ้าไม่เจอให้สร้างอาเรย์
                    rpf = new ArrayList<>();
                }
                rpf.add(rf);//เพิ่มไฟล์ที่หาเจอไปใส่ในลิสเรื่อยๆ

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
        }

        return rpf;
    }

    public static ReportFile downloadReportFile(int id) throws SQLException {
        Connection con = null;

        try {
            con = ConnectionBuilder.getConnection();
            String sql = "Select * from reportfile where fileID = ?";//เรียกดูตามไอดีของไฟล์
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String fileNFromDB = rs.getString("fileName");//เอาชื่อกับตัวไฟล์มาเก็บไว้
                Blob fileData = rs.getBlob("RarFile");

                return new ReportFile(fileNFromDB, fileData);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) { //สร้าง main method ขึ้นมาลองรัน

        ReportFile rf2 = new ReportFile();
        List<ReportFile> rpf = listReportFile();
        for (int i = 0; i <= rpf.size() - 1; i++) {
            System.out.println(rpf.get(i).getFileID());
        }

    }
}
