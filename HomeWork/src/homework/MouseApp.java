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
public class MouseApp {
    public static void main(String[] args) {
        Mouse[] mouses=new Mouse[3];
        
        mouses[0]=new WireMouse("Green",1.5,"USB Type-C");
        mouses[1]=new WirelessMouse("Yellow",2.4);
        mouses[2]=new WirelessMouse("Blue",5);
        
        for(Mouse mouse:mouses){
            System.out.println(mouse.toString());
        }        
        mouses[0].leftClick();
        mouses[1].rightClick();
        mouses[0].scoll(5);
        mouses[1].scoll(-3);        
    }    
}
