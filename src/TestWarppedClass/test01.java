/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestWarppedClass;

/**
 *
 * @author WarSpite
 */
public class test01 {
    public static void main(String[]args)
    {
        Integer i = new Integer(1000);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toHexString(i));
        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2);
        System.out.println(i3.intValue());
        String str  = 234+"";
    }
}
