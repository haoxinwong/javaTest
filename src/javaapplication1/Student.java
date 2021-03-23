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
public class Student {
    String name;
    int id;
    int age;
    String gender;
    int weight;
    Computer computer;
    
    static int ss;
    
    public static void printSS(){
        System.out.println(ss);
    }
    
    public void study()
    {
        System.out.println(name+"在学习");
    }
    public void sayHello(String sname)
    {
        System.out.println(name+"向"+sname+"说：你好！");
        
    }
    /*
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hao";
        s1.study();
        s1.sayHello("wang");
        
        Student s2 = new Student();
        s2.age = 18;
        s2.name = "han";
        
    }
    */
    
}
