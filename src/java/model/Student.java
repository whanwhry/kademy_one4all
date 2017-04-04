/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nunnnunns
 */
public class Student extends Users{
    private int stId,eduYear;
    private String department;

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
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
