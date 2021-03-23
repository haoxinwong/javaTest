/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author WarSpite
 */
public class ScannerTest {
    
    static Scanner st = new Scanner(System.in);
    
    public static int get(){
    int i = st.nextInt();
    return i;
    }
    
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a str: ");
        String str = st.next();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a int: ");
        int i = s.nextInt();
        
      
     
    }
    
}
