/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *异常
 * @author WarSpite
 */
public class MyException extends Exception{
    public MyException(){
    
    }
    
    public MyException(String message){
        super(message);
    }
    
}
class TestMyException{
    void test()throws MyException{
        
    }
    public static void main(String[]args)
    {
        try {
            new TestMyException().test();
        } catch (MyException ex) {
            Logger.getLogger(TestMyException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}