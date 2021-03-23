/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.polymorphism;

/**
 *
 * @author WarSpite
 */
public class HttpServlet {
    public void service(){
        System.out.println("HttpServlet.service()");
        doGet();
    }
    public void doGet(){
        System.out.println("HttpServlet.doGet");
    }
    
}
