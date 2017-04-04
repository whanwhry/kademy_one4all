/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public class RetailApp {

    public static void main(String[] args) {
        CustomerBill[] cust = {new CustomerBill(), new CustomerBill()};//ไว้เก็บไอดีลูกค้า
        double minPrice4Pro = 3000;//ต้องซื้อราคา3000ขึ้นไปถึงจะได้ส่วนลด
        double percentPro=100;//ส่วนลด100%
        double maxPro=200;//ลดได้สูงสุด200บาท
        double promoPrice;//ไว้รอเก็บค่าส่วนลด
        
        Bill[] bills=new Bill[4];//สร้างช่องเก็บ bill 5ช่อง
        
        bills[0]= new FoodBill(cust[0], 500);//รับค่าไอดีกับราคาของ class FoodBill
        bills[1]= new FoodBill(cust[1], 500);
        bills[2] = new GoodsBill(cust[0], 5000);//รับค่าไอดีกับราคาของ class GoodsBill
        bills[3] = new GoodsBill(cust[1], 3500);   
        
        //ข้อมูลจะถูกนำไปคำนวณในmethod setPromoPrice
        bills[0].setPromoPrice(bills[1], minPrice4Pro, percentPro, maxPro); //ไม่ได้ลดเพราะต้องซื้อขั้นต่ำ3000และต้องเอา FoodBill ไปลด GoodsBill
        bills[2].setPromoPrice(bills[0], minPrice4Pro, percentPro, maxPro); //ได้ลดเพราะซื้อตั้ง 5000 เลขไอดีตรงกันและมีการเอา FoodBill ไปใช้ลด
        bills[2].setPromoPrice(bills[1], minPrice4Pro, percentPro, maxPro); 
        
        for(Bill bill:bills){//แสดงผลโดยใช้ for แบบย่อ
            System.out.println(bill.toString()+"\n");     
        }   
    }
}
