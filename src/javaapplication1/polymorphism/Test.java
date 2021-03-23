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
public class Test {
    
    public static void testAnimalVoice(Animal c)
    {
        c.voice();
        if(c instanceof Cat)//判断一个对象是不是一个类型的对象
        {
            ((Cat) c).catchMouse();
        }
    }
    /*public static void testAnimalVoice(Dog c)
    {
        c.voice();
    }
    public static void testAnimalVoice(Pig c)
    {
        c.voice();
    }*/
    public static void main(String[]args){
        Animal a = new Cat();
        testAnimalVoice(a);
        Cat a2 = (Cat)a;


    }
}
