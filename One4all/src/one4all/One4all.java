/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one4all;

import java.util.*;

/**
 *
 * @author KARTOON
 */
public class One4all {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("Slot 1");
        a.add("Slot 2");
        a.add("Slot 3");
        
        for(String b:a){
            System.out.println(b);
        }
        a.remove("Slot 3");
        for(String b:a){
            System.out.println(b);
        }
    }

}
