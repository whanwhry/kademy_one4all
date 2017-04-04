/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public abstract class Bill {//เป็น abstract class

    protected long billId;//ตั้งเป็น protected เพื่อให้ class อื่นนำไปใช้ได้แต่ต้องอยู่ภายใน package เดียวกัน
    private CustomerBill cust;//เป็นการนำข้อมูลจาก class Customer(ก็คือไอดีลูกค้า) มาเก็นในตัวแปร cust
    private double totalPrice;//ราคาทั้งหมด
    private double promoPrice;//ราคาโปรโมชั่นว่าจะลดไปเท่าไหร่

    public Bill(CustomerBill cust, double price) {
        this.cust = cust;
        this.totalPrice = price;
    }

    public CustomerBill getCust() {
        return cust;
    }

    public void setCust(CustomerBill cust) {
        this.cust = cust;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public void setPromoPrice(Bill bill, double minPrice, double percentPro, double maxPro) {
        if (this instanceof GoodsBill && bill instanceof FoodBill && this.cust.getCustId() == bill.cust.getCustId()&& this.totalPrice > minPrice) {
            //ใน if แรกเงื่อนไขดังนี้
            //object bills ที่สร้างขึ้นมานั่นใช่ GoodsBill หรือไม่และ bill ที่รับค่าเข้ามาใช่ FoodBill หรือไม่ ต้องเทียบเพราะเราจะเอา FoodBill ไปลดราคา GoodsBill
            //เทียบว่าไอดีของบิลทั้งสองใช่ไอดีเดียวกันมั้ย เนื่องจากถ้าเป็นคนละไอดีจะไม่สามารถนำมาลดราคาได้
            //เทียบว่าราคาทั้งหมดมากกว่าราคาขั้นต่ำที่จะลดราคาได้ หรือไม่
            //ทุกเงื่อนไขต้องเป็นจริงจะทำใน if นี้ได้
            promoPrice = percentPro * this.getTotalPrice() / 100;
            //สูตรคำนวณว่าจะได้ส่วนลดเท่าไหร่ และเก็บค่าใน promoPrice
        }
        if (promoPrice > maxPro) {//ถ้าส่วนลดมากกว่าราคาส่วนลดสูงสุดที่กำหนดไว้
            promoPrice = maxPro;//ก็คือส่วนลดก็จะได้มากสุดเท่าที่เรากำหนดในที่นี้คือ 200 บาท ถึง promoPrice จะเท่ากับ5000ก็ลดได้มากสุดแค่200
        }
    }

    @Override
    public String toString() {
        return "Bill id: " + billId + " " + cust + "\nTotal Price = "
                + totalPrice + ", Promotion Price="
                + promoPrice + "\nNet : " + (totalPrice - promoPrice);//Net คือสรุปราคาที่ต้องจ่าย คือราคาทั้งหมดลบกับส่วนลด
    }

}
