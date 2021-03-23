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
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hao";
        s1.study();
        s1.sayHello("wang");
        
        Student s2 = new Student();
        s2.age = 18;
        s2.name = "han";
        
        Computer c = new Computer();
        c.brand = "联想";
        c.cpuSpeed = 100;
        
        s1.computer = c;
        c.brand = "戴尔";
        System.out.println(s1.computer.brand);
        
    }
    
}
