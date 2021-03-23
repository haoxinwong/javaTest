/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode;

/**
 *
 * @author WarSpite
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int temp = 0;
        int check = x;
        if(x==0){return true;}
        if(x>0 && x%10!=0 ){
            while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
            if(temp == check){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[]args){
        
        boolean a;
        a = isPalindrome(123);
        System.out.println(a);
    }
}
