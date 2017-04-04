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
public class TestRectangle {

    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(10, 30);
        Rectangle rect2 = new Rectangle(5, 15);

        rect1.setColor("Black");
        rect2.setColor("Pink");

        System.out.println("Area of " + rect1.getColor() + " Rectangle : " + rect1.getArea());
        System.out.println("Perimeter of " + rect1.getColor() + " Rectangle : " + rect1.getPerimeter());
        System.out.println("-------------------------------");

        System.out.println("Area of " + rect2.getColor() + " Rectangle : " + rect2.getArea());
        System.out.println("Perimeter of " + rect2.getColor() + " Rectangle : " + rect2.getPerimeter());
        System.out.println("-------------------------------");
        System.out.println("There are "+Rectangle.getCount()+" rectangle");

    }
}
