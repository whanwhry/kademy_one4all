/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

    private double width, height;
    DecimalFormat dcm = new DecimalFormat("0.00");

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.setType("Rectangle");

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double x = width * height;
        double output = Double.parseDouble(dcm.format(x));
        return output;
    }

    @Override
    public double getPerimeter() {
        double x = 2 * (width + height);
        double output = Double.parseDouble(dcm.format(x));
        return output;

    }

}

