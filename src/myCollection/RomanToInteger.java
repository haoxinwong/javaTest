/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCollection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WarSpite
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        List<String>a = new ArrayList();
        for( int i = 0;i<s.length();i++){
                a.add(s.substring(i,i+1));
        }
        List<Integer>b = new ArrayList();
        for(int i = 0;i<a.size();i++){
            if(a.get(i).equals("I")){
                b.add(1);
            }
            if(a.get(i).equals("V")){
                b.add(5);
            }
            if(a.get(i).equals("X")){
                b.add(10);
            }
            if(a.get(i).equals("L")){
                b.add(50);
            }
            if(a.get(i).equals("C")){
                b.add(100);
            }
            if(a.get(i).equals("D")){
                b.add(500);
            }
            if(a.get(i).equals("M")){
                b.add(1000);
            }
        }
        for(int i =0;i<b.size()-1;i++){
            if (b.get(i)<b.get(i+1)){
                b.set(i, b.get(i+1)-b.get(i));
                b.remove(i+1);
            }
        }
        int ans = 0;
        for(int i =0;i<b.size();i++){
            ans=ans+b.get(i);
        }
        return ans;
        
    }
    public static void main(String[]args){
        System.out.println(romanToInt("IV"));
    }
    
}
