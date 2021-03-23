/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

import java.text.ParseException;

/**
 *
 * @author WarSpite
 */
public class TException {
    public static void main(String[]args)
    {
        //int i = 1/0;
        Computer c = null;//没有new Computer();
        Computer e = new Computer();
        //遇到空指针这么做
        if (c != null){
        c.start();
      }
        //c.start(); //空指针异常，对面是空的，调用对象的方法或属性
        e.start();
        
        try{
            Thread.sleep(33330);
        }catch(Exception i){
            i.printStackTrace();
        }
        
    }
    
}

class Computer{
    public void start()
    {
        System.out.println("计算器启动！");
    }
}