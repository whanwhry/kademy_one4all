/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author KARTOON
 */
public class CarRentApp {
    public static void main(String[] args) {
        Customer cust = new Customer("Kartoon", "Srk");//สร้าง object cust รับค่าชื่อกับนามสกุล
        Car[] cars = new Car[2];//สร้างobject cars จาก class Car เป็นอาเรย์มาเก็บค่า
        cars[0] = new Car("AB-4357", 60);//ราคาเช่าก็คือชั่วโมงละ 60 บาท
        cars[1] = new Car("ZV-2343", 80);//ราคาเช่าก็คือชั่วโมงละ 80 บาท

        Rental[] rent = new Rental[2];//สร้างobject rent จาก class Rental เป็นอาเรย์มาเก็บค่า
        rent[0] = new Rental(cust, cars[0], 20);//rent เก็บชื่อ,นามสกุล,ค่าทะเบียน,ราคา,ชั่วโมงที่เช่า
        rent[0].addHours(20);//ทำการเพิ่มชั่วโมง จาก 20 ชม.กลายเป็น 40 ชม.
        rent[1] = new Rental(cust, cars[1], 15);
        
        System.out.println(rent[0].toString());//แสดงผล
        System.out.println(rent[1].toString());
    }
}
