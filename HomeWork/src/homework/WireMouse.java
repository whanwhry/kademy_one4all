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
public class WireMouse extends Mouse {
    private double cableLength;
    private String connector;

    public WireMouse(String color,double cableLength, String connector) {
        super(color);
        this.cableLength = cableLength;
        this.connector = connector;
    }

    @Override
    public String toString() {
        return super.toString()+" - Wire mouse with cable length " 
                + cableLength + " m, " + connector+" connector";
    }

    @Override
    public void leftClick() {
       System.out.println(super.toString()+" >> Click");
    }

    @Override
    public void rightClick() {
        System.out.println(super.toString()+" >> Context Menu");
    }
    
}
