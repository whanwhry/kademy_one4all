/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public class SalePrice {

    private String ProductName;
    private int price;
    private int percentSale;

    public SalePrice(String ProductName, int price, int percentSale) {
        this.ProductName = ProductName;
        this.price = price;
        this.percentSale = percentSale;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPercentSale() {
        return percentSale;
    }

    public void setPercentSale(int percentSale) {
        this.percentSale = percentSale;
    }

    public String Sale() {
        String output = "";
        double salePrice, totalPrice = 0;
        if (this.percentSale > 10 && this.percentSale <= 70) {
            salePrice = (this.price * this.percentSale) / 100;
            totalPrice = this.price - salePrice;
            output = "\nThis Product has promotion!! \nSale : " + this.percentSale
                    + "%" + "\nTotal Price : " + totalPrice + "\n----------------";
        } else {
            output = "\nThis product doesn't have promotion.\nTotal Price : "
                    + this.price + "\n----------------";
        }

        return output;
    }

    @Override
    public String toString() {
        return "ProductName = " + ProductName + "\nPrice = " + price + Sale();
    }

}
