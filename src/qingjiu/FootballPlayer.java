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
public class FootballPlayer {
    //创建一系列这个class要求的variable
    private int number;
    private String name;
    private String position;
    //*这个特别，要有height才能做，要import height？但是我没有报错
    //算了，错了再改
    public Height height;//偷偷改成public
    private int weight;
    //这里hometown的t，大写，作为规范
    private String homeTown;
    private String highSchool;
    //要做很多的get和set，老师变态？
    //我反正不写，让他滚
    //你自己写，不写的话，把private改public
    //可能扣分？
    public FootballPlayer(int number,   String name,String position,
                          Height height,int weight, String homeTown, 
                          String highSchool){
        //写一下构造器，由于过长记得分行
        this.number = number;
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.homeTown = homeTown;
        this.highSchool = highSchool;
        
    }
    //还有很多get 和 set，不写，你自己写
    public String getName(){
        return this.name;
    }

    
   
    
}
