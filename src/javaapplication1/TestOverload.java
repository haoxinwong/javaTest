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
public class TestOverload {
    public static void main(String[] args){
        MyMath m = new MyMath();
        int result = m.add(4,5);
        System.out.println(result);
    }
    
}

class MyMath{
    public int add(double a, int b)
    {
        return(int)(a+b);
    }
    
    public int add(int a, int b)
    {
        return a+b;
    }
    
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
