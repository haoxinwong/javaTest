/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/**
 *
 * @author WarSpite
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        int $ = 3;
        System.out.println($);
        char c = 'a';
        for(int i = 0; i<26;i++)
        {
            char temp = (char)(c+i);
            System.out.print(temp);
        }
        System.out.println();
        int a = 4;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(-a);
        System.out.println(3<<4);
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i<=100;i++)
        {
            if(i%2!=0)
            {
                oddSum+=i;
            }
            else
            {
                evenSum+=i;
            }
            
        }
        System.out.println("奇总和"+oddSum);
        System.out.println("偶总和"+evenSum);
        
        for(int j =1; j<=1000;j++)
        {
            if(j%5==0)
            {
                System.out.print(j+"\t");
            }
            if(j%15==0)
            {
                System.out.println();
            }
        }
    }
    
}
