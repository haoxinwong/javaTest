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
public interface MyInterface {
   //接口里面只有常量和抽象方法
    /*public static final接口常量定义时，写与不写都是这样*/String MAX_GRADE = "BOSS";
    int MAX_SPEED =120;
    
    public void test01();//必须public，无法private，写和不写的都是public
    public int test02(int a, int b);
    
}
