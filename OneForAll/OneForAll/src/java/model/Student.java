
package model;


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