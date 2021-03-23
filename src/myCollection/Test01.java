/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * collection修改快，查询慢
 * @author WarSpite
 */
public class Test01 {
    public static void main(String[]args){
        List list = new ArrayList();//ArrayList 插入修改效率低
                                    //Arraylist 可变LinkedList等
        //ArrayList：底层实现时数组，线程不安全，效率低。所以查询快，修改插入删除慢
        //LinkedList:底层实现时链表，线程不安全，效率低。所以查询慢，修改插入删除快
        //Vector: 线程安全，效率低
        List <String>list3 = new ArrayList();
        list3.add("w");
        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);//包装类，自动装箱
        System.out.println(list.size());
        System.out.println(list.isEmpty());
  //      list.remove(new Date()); //hashcode 和 equals
  //      System.out.println(list.size());
        List list2 = new ArrayList();
        list2.add("bbb");
        list2.add("ccc");
        list.add(list2);
        System.out.println(list);
        
        //跟顺序的操作，如果是collection，就用不着了
        String str = (String)list.get(0);
        System.out.println(str);
        list.set(1,"asa");
        list.remove(0);
    }
    
}
class Dog{
    
}
