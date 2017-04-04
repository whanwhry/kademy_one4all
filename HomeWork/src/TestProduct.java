/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTOON
 */
public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product("ball","toy");//จะกรอกข้อมูลลงใน constructor ก็ได้
        Product product2 = new Product();
        Product product3 = new Product();
        
        product2.setProductName("Ring");//หรือทำการ set ค่าเอาก็ได้
        product2.setProductType("accessory");
        
        product3.setProductName("Chanel");
        product3.setProductType("bag");
        System.out.println(product2.getStock());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
    }
          
}
