/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTOON
 */
public class Student {

    private String name;
    private int studentId;
    private String status;
    private static int countAll,countPre,countAb;

    public Student(String name, int studentId, String status) {
        this.name = name;
        this.studentId = studentId;
        this.status = status;
        countAll++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int totalStudent() {

        return countAll;
    }

    public int presentStudent() {
        int countPre = 0;

        if (this.status.equalsIgnoreCase("present")) {
            countPre++;
        }
        return countPre;
    }

    public int AbsentStudent() {
        int countAb = 0;

        if (this.status.equalsIgnoreCase("absent")) {
            countAb++;
        }
        return countAb;
    }

    @Override
    public  String toString() {
        return "Student" + "Name : " + name + "\nStudentId : " + studentId + "\nStatus : "
                + status  ;
    }
}
