/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author WarSpitetime
 */
public class TimeTable{
    public static void main(String[] args) {
        for(int m = 1;m<=9;m++)
        {
            for(int i = 1;i<=m;i++)
            {
                System.out.print(i+"*"+m+"="+(i*m)+"\t");
            }
            System.out.println();
        }
    }
    
}
