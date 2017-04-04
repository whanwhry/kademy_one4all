/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KARTOON
 */
public class Student {
    private int eduYear;
    private String department;
    private long  stID/*รหัสนศ*/;

    public Student() {
    }

    public Student(long stID, int eduYear, String department) {
        this.stID = stID;
        this.eduYear = eduYear;
        this.department = department;
    }

    public Student(long stID) {
        this.stID = stID;
    }
    

    public long getStID() {
        return stID;
    }

    public void setStID(long stID) {
        this.stID = stID;
    }

    public int getEduYear() {
        return eduYear;
    }

    public void setEduYear(int eduYear) {
        this.eduYear = eduYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}

