/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author WarSpite
 */
public class Encapsulation01 {
    private String name;//用private做变量
    private String id;
    private boolean man;
    public static int m;
    public static final int MAX_SPEED = 100;
    //static 和 final都public
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public boolean isMan()
    {
        return man;
    }
    public void setMan(boolean man)
    {
        this.man = man;
    }
    public static void main(String[]args){
        System.out.print(" w");
    }
            
    
    
}
