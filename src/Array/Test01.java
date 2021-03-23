/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author WarSpite
 */
public class Test01 {
    public static void main(String[]args){
        /*
        1.数组是同数据类型的有序集合
        2.数组也是一个对象,数组元素相当于对象的成员变量
        3.数组的长度是固定的不可变的
        */
        int[] a;
        a = new int[3];
        a[0] = 23;
        a[1] = 28;
        a[2] = 32;
        double[] b = new double[2];
        Car[] cars = new Car[10];
        cars[0] = new Car("奔驰");
        cars[1] = new Car("路虎");
        cars[2] = new Car("宝马");
        System.out.println(cars);
        System.out.println(cars[0].name);
        System.out.println(a.length);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int i = 123;
        String s = "123";
        
    }
}
