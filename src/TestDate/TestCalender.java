/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author WarSpite
 */
public class TestCalender {
    public static void main(String[]args)
    {
        Calendar c = new GregorianCalendar();
        //c.set(2001, Calendar.FEBRUARY, 10, 12, 23, 34);
        //c.set(Calendar.YEAR, 2001);
        //c.set(Calendar.MONTH, 1);
        //c.set(Calendar.DATE, 10);
        //c.setTime(new Date());
        Date d = c.getTime();
        System.out.println(d);
        System.out.println(c.get(Calendar.YEAR));
        
        c.add(Calendar.YEAR, 30);
        System.out.println(c);
        
    }
    
}
