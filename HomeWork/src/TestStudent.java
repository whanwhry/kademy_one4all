/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTOON
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Kartoon",59103,"present");
        Student student2 = new Student("Tom",59104,"present");
        Student student3 = new Student("Jonh",59105,"present");
        Student student4 = new Student("Kim",59106,"present");
        Student student5 = new Student("Jane",59107,"absent");
     
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
    }
}
