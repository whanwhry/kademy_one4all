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
public class CustomerBill {
    private long custId; //เป็น attribute ไว้สำหรับเก็บค่าไอดีของลูกค้า
    private static long count; //เป็นตัวไว้ค่อยนับไอดีลูกค้าโดยตั้งเป็น static เป็นค่าคงที่ให้ทุก class เข้าใจตรงกันว่ามีค่าเท่าไหร่

    public CustomerBill() {
        count++; //เมื่อมีการสร้าง object ขึ้นมาค่าของ countจะเพิ่มขึ้นที่ละ 1
        this.custId = count; //และ count จะถูกเก็บลงใน custId เป็นการนับไอดีลูกค้านั่นเอง
    }

    public long getNumOfCustomer() {
        return count;
    }

    public long getCustId() {
        return custId;
    }
    

    @Override
    public String toString() {
        return "Customer id: " + custId;
    }
  
}