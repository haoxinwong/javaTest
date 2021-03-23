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
public class ValidParentheses {
    public static Boolean isValid(String s){
        String st = "";
        String ts = "";
        String a = new String(s);
        for(int i = 0;i<s.length()-1;i++){
            if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals(")")){
                st+="1";
            }
            if(s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("]")){
                st+="2";
            }
            if(s.substring(i,i+1).equals("{")||s.substring(i,i+1).equals("}")){
                st+="3";
            }
        }
        for(int i = st.length()-1;i>=0;i--){
            ts+=st.charAt(i);
        }
        if(ts.equals(st)){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println(isValid("()"));
    }
    
}
