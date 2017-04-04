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
public class Customer {//เป็นclassธรรมดา มี attribute,constructor และ method toString()
    private String name,sname;

    public Customer(String name,String sname) {
        this.name = name;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return name +' '+sname;
    }  
}
