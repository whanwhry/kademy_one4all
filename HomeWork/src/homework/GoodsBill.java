/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public class GoodsBill extends Bill {//เป็นลูกของ class Bill ทำให้สามารถเรียกใช้ method,constructor และattribute ของคลาสพ่อได้

    private static long count;//เป็นตัวไว้ค่อยนับไอดีของบิลโดยตั้งเป็น static เป็นค่าคงที่ให้ทุก class เข้าใจตรงกันว่ามีค่าเท่าไหร่

    public GoodsBill(CustomerBill cust, double price) {
        super(cust, price);//เรียก attribute ของคลาสพ่อมาใช้ ในที่นี่คือ price กับ cust(เป็น attribute ใน class Cusomer ที่เป็นคลาสูกอีกที)
        count++;//เมื่อมีการสร้าง object ขึ้นมาค่าของ countจะเพิ่มขึ้นที่ละ 1
        this.billId = count;//และ count จะถูกเก็บลงใน billId เป็นการนับไอดีของบิล
    }

    public static long getNumOfBill() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Goods Bill, "+super.toString();//เรียก toString คลาสพ่อมาใช้
    }
}
