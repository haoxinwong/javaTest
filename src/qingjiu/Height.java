/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qingjiu;

/**
 *
 * @author WarSpite
 */
public class Height {
    private int feet; //做两个private的variable，一个feet，一个inches
    private int inches;
    
    public Height(int feet,int inches){
        //构造器，当构造时候，要写入feet 和inches（系统自带无参，如果不手动建立）
        this.feet = feet;
        this.inches = inches;
    }
    
    public void setFeet(int feet){
        //reset feet to a new value
        this.feet = feet;
    }
    
    public int getFeet(){
        //return feet,因为是private，所以要get和set
        return this.feet;
    }
    
    public void setInches(int inches){
        //同上，不改注释，自己看
        //reset feet to a new value
        this.inches = inches;
    }
    
    public int getInches(){
        //return feet,因为是private，所以要get和set
        return this.inches;
    }
    
    public String instance(){
        //创建一个String a， 并把答案赋予它
        String a;
        a = this.feet+"'"+this.inches+"\"";
        return a;
        /*
        也可以简写成：
        意思不变
        return this.feet+"'"+this.inches+"\"";
        */
    }
}
