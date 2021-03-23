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
public class Test02 {
    public static void main(String[]args)
    {
        //Integer a = new Integer(1000);
        Integer a = 1000;
        Integer b = 1000;
        
        int c = new Integer(1500);//编译器改进：new Integer(1500).intValue();
        
        Integer d = 2000;
        int e = d;//编译器改进：b.intValue();
        
        Integer f = 1234;
        Integer f2 = 1234;
        System.out.println(f==f2);
        System.out.println(f.equals(f2));
        
        System.out.println("###########");
        Integer f3 = 123;//[-128,127]之间的数，仍然能当做基本数据类型来处理
        Integer f4 = 123;
        System.out.println(f3==f4);
        System.out.println(f3.equals(f4));
        
        
        
    }
    
}
