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
public abstract class Mouse {
    private String color;

    public Mouse(String color) {
        this.color = color;
    }
    
    public abstract void leftClick();
    
    public abstract void rightClick();
    
    public void scoll(int step){
        String scoll;
        scoll=(step>=0)?"Up ":"Down ";
        System.out.println(scoll+step*3 + " lines");
    }

    @Override
    public String toString() {
        return  color + " mouse";
    }
    
}
