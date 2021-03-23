/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 十分完善的处理异常
 * @author WarSpite
 */
public class TestReadFile {
    public static void main(String[]args)
    {
        FileReader reader = null;//外部声明变量，使得finally可用
        try{
        reader = new FileReader("C:/NetBeans/JavaApplication1/fileForTest/test01.txt");
        char c = (char)reader.read();
        char c2 = (char)reader.read();
        System.out.println(""+c+c2);
        }catch(FileNotFoundException e){//遇到异常，子类放前面父类放后面
            e.printStackTrace();//文件没有找到
        }
        catch(IOException e ){
            e.printStackTrace();//读取文件出错
        }finally{//不管有没有异常，一定执行此内容
            try{
                if(reader != null){
                    reader.close();//关闭reader，减少服务器消耗
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        //当try catch中有返回值时
        //1.执行try catch， 给返回值赋值
        //2.执行finally  (不要再finally中赋值)
        //3.return
    }
}
