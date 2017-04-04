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
public class WirelessMouse extends Mouse{
    private double frequency;

    public WirelessMouse(String color,  double frequency) {
        super(color);
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return super.toString()+" - Wireless mouse with " 
                + frequency + " Ghz wireless technology";
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