/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestString;

/**
 *
 * @author WarSpite
 */
public class TestString {
    public static void main(String[]args){
        String str = new String("abcd");
        String str2 = new String("abcd");
        System.out.println(str.charAt(2));
        System.out.println(str2.equals(str));
        System.out.println(str2 == str);
        
        String str3 = "def";
        String str4 = "def";
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        
        System.out.println(str3.indexOf('y'));
        String s = str3.substring(1);
        System.out.println(s);
        String str5 = str3.replace('e', '*');
        System.out.println(str5);
        String str6 = "abce,cad,awde";
        String[] strArray = str6.split(",");
        
        String str7 = "  aa  bb  ";
        String str77 = str7.trim();
        System.out.println(str77);
        
        
        
        StringBuilder gh = new StringBuilder("a");
        for(int i = 1;i<100;i++){
            gh.append(i);
        }
        System.out.println(gh);
    }
}
