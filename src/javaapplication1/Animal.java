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
public class Animal {
    String eye;
    
    public void run()
    {
        System.out.println("我跑");
    }
    
    public void eat()
    {
        System.out.println("吃吃");
        
    }
    public void sleep()
    {
        System.out.println("zzzzz");
    }
}
class Mammal extends Animal
{
    public void taisheng()
    {
        System.out.println("胎生");
    }
}
class Bird extends Animal
{
    
    public void run()
    {
        System.out.println("我是一只小小鸟，飞飞");
    }
    public void eggsheng()
    {
        System.out.println("卵生");
    }
}