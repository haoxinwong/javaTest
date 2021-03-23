/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.polymorphism;

/**
 *
 * @author WarSpite
 */
public class Animal {
    public void voice()
    {
        System.out.println("普通动物叫声");
    }
    
}
class Cat extends Animal
{
    public void voice()
    {
        System.out.println("喵喵喵");
    }
    public void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal
{
    public void voice()
    {
        System.out.println("汪汪汪");
    }
    public void seeDoor()
    {
        System.out.println("看门");
    }
}
class Pig extends Animal
{
    public void voice()
    {
        System.out.println("哼哼哼");
    }
    
}
class Tiger extends Animal
{
    public void voice()
    {
        System.out.println("吼吼吼");
    }

}