/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;


/**
 *
 * @author INT105
 */
public class TestShape {

    public static void main(String[] args) {
        Shape[] a = new Shape[6];

        a[0] = new Circle("black", 5);
        a[1] = new Circle("purple", 10);
        a[2] = new Circle("blue", 15);

        a[3] = new Rectangle("green", 10.0, 45);
        a[4] = new Rectangle("yellow", 20.0, 16);
        a[5] = new Rectangle("orange", 30.0 , 5);

        
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
            System.out.println("--------------");
        }
    }
}

