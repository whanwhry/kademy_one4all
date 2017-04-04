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
public class TestSalePrice {

    public static void main(String[] args) {
        SalePrice[] product = new SalePrice[3];
        product[0] = new SalePrice("MacBook", 40000, 15);
        product[1] = new SalePrice("Mc", 1900, 20);
        product[2] = new SalePrice("Car", 2000000, 75);

        for (int i = 0; i <= 2; i++) {
            System.out.println(product[i]+"\n");
        }
    }
}
