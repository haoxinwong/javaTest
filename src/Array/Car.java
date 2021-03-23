/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author WarSpite
 */
public class Car {
    String name;
    public Car(String name)
    {
        this.name = name;
    }
    public static void main(String[]args){
        int i = (int)(Math.random()*4+1);
        System.out.println(i);
        
        switch(i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
    
}
