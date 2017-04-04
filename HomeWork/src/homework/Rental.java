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
public class Rental {
    private Customer cust;//สร้าง attribute cust ซึ่งเป็น type Customer ไว้เก็บค่าชื่อกับนามสกุล 
    private Car car;//สร้าง attribute car ซึ่งเป็น type Car ไว้เก็บค่าทะเบียนกับราคาเช่า
    //เป็นการ Aggegation โดยที่ class Customer,class Car เป็นส่วนหนึ่งของ class Rental
    //ถึงแม้ไม่มี class Rental class Customerกับclass Car ก็ยังมีอยู่ไม่ได้หายไป
    private int hours;

    public Rental(Customer cust, Car car, int hours) {
        this.cust = cust;
        this.car = car;
        this.hours = hours;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void addHours(int hours) {
    //เป็น method ไว้เพิ่มชั่วโมงโดยถ้ามีการเพิ่มชั่วโมงเข้ามา
    //ก็จะทำการบวกชั่วโมงที่เพิ่มเข้ามากับชั่วโมงเดิมที่มีอยู่แล้วเก็บในตัวแปร hours
        this.hours += hours;
    }

    @Override
    public String toString() {
        return "Customer : " + cust + " rent car " + car 
                + "\nRent " + hours + " hours, Total "
                +hours*car.getPricePerHour()+" baht\n";
        //ตรง hours*car.getPricePerHour()คือการคำนวณราคาทั้งหมดที่ต้องจ่าย 
        //โดยคิดจากการเอาชั่วโมงมาคูณกับราคาเช่าต่อชั่วโมงที่ถูกรับค่าเข้ามาเก็บใน class Car 
        //เวลาใช้จึงต้องเป็น car.getPricePerHour()
    }
}
