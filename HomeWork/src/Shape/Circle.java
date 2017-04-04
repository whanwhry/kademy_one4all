/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.text.DecimalFormat;

public class Circle extends Shape {

    private double radius;
    DecimalFormat dcm = new DecimalFormat("0.00");

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.setType("Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        double x = Math.PI * (radius * radius);
        double output = Double.parseDouble(dcm.format(x));
        return output;

    }

    @Override
    public double getPerimeter() {
        double x = 2 * Math.PI * radius;
        double output = Double.parseDouble(dcm.format(x));
        return output;

    }


}
