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
public class MyClass implements MyInterface{

    @Override
    public void test01() {
        //MyInterface.MAX_GRADE;
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("MyClass.test02()");
        return a+b;
    }
    
}
