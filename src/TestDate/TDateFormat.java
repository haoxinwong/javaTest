/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WarSpite
 */
public class TDateFormat {
    public static void main(String[]args) throws ParseException
    {


        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        Date d = new Date(12132312L);

        String str = df.format(d);//将时间对象转换为字符串
        System.out.println(str);
        System.out.println("#################");
        String str2 = "1977-7-7";
        DateFormat df2 = new SimpleDateFormat("yyyy-mm-dd");
        try{
            Date d2 = df2.parse(str2);
            System.out.println(d2);
        }
        catch(ParseException e)
        {
        }
    }

}
