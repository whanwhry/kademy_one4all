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
class Rectangle {

    private String color;
    private int width;
    private int height ;
    private static int count;

    public String getColor() {
        return color;
    }

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;
        count++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPerimeter() {
        return (2 * (width + height));
    }

    public double getArea() {
        return (width * height);
    }
    public static int getCount(){
		return count;
	}
}
