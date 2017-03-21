
package model;


public class Student extends Users {
   private int stID;
   private String department;
   private int eduYear;

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEduYear() {
        return eduYear;
    }

    public void setEduYear(int eduYear) {
        this.eduYear = eduYear;
    }
   
}
