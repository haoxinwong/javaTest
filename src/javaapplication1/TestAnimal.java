/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author WarSpite
 */
public class TestAnimal {
    public static void main(String[]args){
        Bird b = new Bird();
        b.run();
        Animal a = new Animal();
        a.eat();
        Object obj = new Object();
        Object obj2 = new Object();
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
    }
    
}
