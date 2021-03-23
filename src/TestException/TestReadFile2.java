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
 *
 * @author WarSpite
 */
public class TestReadFile2 {
    public static void main(String[]args)
    {
        String str = null;
        try{
            str = new TestReadFile2 ().openFile();
        }catch(FileNotFoundException e){//遇到异常，子类放前面父类放后面
            e.printStackTrace();//文件没有找到
        }
        catch(IOException e ){
            e.printStackTrace();//读取文件出错
        }
        System.out.println(str);
    }
    
    String openFile() throws FileNotFoundException ,IOException{//抛出异常，上级处理
        FileReader reader = new FileReader("C:/NetBeans/JavaApplication1/fileForTest/test01.txt");
        char c = (char)reader.read();
        System.out.println(c);
        return ""+c;
    }
}
