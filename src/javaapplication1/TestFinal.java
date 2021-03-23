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
public /*final*/class TestFinal {//final 这个类不能被继承
    public /*final*/void run(){//final 这个方法不能被重写
    System.out.println("run");
    }
    
}

class Bir extends TestFinal
{
    public void run(){
        System.out.println("飞");
    }
}
