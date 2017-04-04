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
public class Car {//เป็นclassธรรมดา มี attribute,constructor และ method toString()
    private String licensePlate;//ทะเบียนรถ
    private double pricePerHour;//ราคาเช่าต่อชั่วโมง

    public Car(String licensePlate, double pricePerHour) {
        this.licensePlate = licensePlate;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public String toString() {
        return "license plate : " + licensePlate 
                + ", price " + pricePerHour+" per hour" ;
    }
        
}