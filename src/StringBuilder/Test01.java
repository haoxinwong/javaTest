/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder;

/**
 * 测试可变字符系列，stringBuilder(线程不安全，效率高）
 *                 stringBuffer (线程安全，效率低）
 * String 不可变字符系列
 * @author WarSpite
 */
public class Test01 {
    public static void main(String[]args)
    { 
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(32);
        StringBuilder sb2 = new StringBuilder("abcd");
        sb2.append("efg");
        sb2.append(true).append(321).append("垃圾");//通过return this 完成
        
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("wdadwdsdw");
        sb3.delete(3,5);
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);
        
        

        
    }
    
}
