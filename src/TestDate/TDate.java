/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDate;

import java.util.Date;

/**
 *
 * @author WarSpite
 */
public class TDate {
    public static void main(String[]args)
    {
        Date d = new Date();
        long t = System.currentTimeMillis();
        System.out.println(t);
        
        Date d2 = new Date(1000);
        
        System.out.println(d2.toGMTString());//不建议使用
        d2.setTime(2000);
        System.out.println(d2.getTime());
        System.out.println(d.getTime()<d2.getTime());
    }
    
}
