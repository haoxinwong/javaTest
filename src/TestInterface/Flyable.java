/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInterface;

/**
 *
 * @author WarSpite
 */
public interface Flyable {
    int MAX_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
    
    
}

interface Attack{
    void attack();
}
class Plane implements Flyable
{

    @Override
    public void fly() {
        System.out.println("飞机你拿发动机飞");
    }
    
}

class Man implements Flyable{

    @Override
    public void fly() {
        System.out.println("跳起来，飞");
    }
    
}

class Stone implements Flyable,Attack{//可以有多个接口

    @Override
    public void fly() {
        System.out.println("扔");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击");
    }
    
}