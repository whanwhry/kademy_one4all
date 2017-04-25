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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KARTOON
 */
public class ReportFile {

    private int fileID, reportID;

    public ReportFile() {

    }

    public ReportFile(int fileID, int reportID) {
        this.fileID = fileID;
        this.reportID = reportID;
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

    public static List<ReportFile> listReportFile() {//สร้างmethodเป็นอาเรย์ลิส
        List<ReportFile> rpf = null;//สร้างอาเรย์ลิสเพื่อที่เก็บชื่อเป็นลิส
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from reportfile"; //ใช้ภาษาsqlหาชื่อ
            PreparedStatement st = con.prepareStatement(sql);// เตรียมคำสั่งนี้ให้สมบูรณ์(ข้างบน)
            ResultSet rs = st.executeQuery();
            while (rs.next()) {//สร้างลูปแสดงไฟล์ที่โดนรีพอร์ต
                ReportFile rf = new ReportFile();
                rf.setFileID(rs.getInt("fileID"));

                if (rpf == null) {//ถ้าไม่เจอให่สร้างอาเรย์
                    rpf = new ArrayList<>();
                }
                rpf.add(rf);//เพิ่มชื่อที่หาเจอไปในลิสเรื่อยๆ

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return rpf;
    }

    public static void main(String[] args) {

        ReportFile rf2 = new ReportFile();
        List<ReportFile> rpf = listReportFile();//ทดลองหาชื่อ
        for (int i = 0; i <= rpf.size() - 1; i++) {
            System.out.println(rpf.get(i).getFileID());
        }

    }
}
