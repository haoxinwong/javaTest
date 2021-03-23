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
public class Test02 {
    public static void main(String[]args){
        //声明
        int []a;
        int b[];
        //创建数组对象
        a = new int[4];
        b = new int[5];

        //初始化
        //a[0] = 23;
        //a[1] = 45;
        for (int i =0;i<a.length;i++){
            a[i] = i*12;
        }
        
        int c[] = {23,43,56,78};//长度：4 索引访问[0,3]
        
        Car[] cars = {new Car("car1"),new Car("car2"),new Car("car3")};
        
        int d[] = {1,2,3,4,5};
        System.out.println(d.length);
        
    }
    
}
