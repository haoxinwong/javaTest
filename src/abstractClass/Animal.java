/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author WarSpite
 */
public abstract class Animal {//将方法的设计和方法的实现分离
    public abstract void run();
    {
        
    }
    public void breath(){
        System.out.println("呼吸");
        run();
    }
}

class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("猫跑");
    }
    
}
class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("狗跑");
    }
    
}