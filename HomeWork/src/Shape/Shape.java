/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

public abstract class Shape {

    private String color, type;
    

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return ">>Shape<<"
                + "\nColor : " + color
                + "\nType : " + type
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter();
    }

}
