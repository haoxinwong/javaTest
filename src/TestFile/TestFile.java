/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WarSpite
 */
public class TestFile {
    public static void main(String[]args)
    {
        File f = new File("C:/NetBeans/JavaApplication1/fileForTest/test01");
        File f2 = new File("C:/NetBeans/JavaApplication1/fileForTest");
        File f3 = new File(f2,"test01");
        File f4 = new File(f2,"TestFile666.java");
        File f5 = new File("C:/NetBeans/awd/awd/wadwq");
        f5.mkdir();//如果前面的目录不存在就做一个
        f5.mkdirs();//如果前面的目录不存在，就帮你做了
        f4.delete();
        
        
        if(f.isFile())
        {
            System.out.println("是一个文件");
        }
        
        if(f.isDirectory())
        {
            System.out.println("是一个目录");
        }
        
        
    }
    
}
