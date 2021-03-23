/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 测试窗口物体沿着各种轨迹移动
 * @author WarSpite
 */
public class GameFrame02 extends Frame{
    Image img = GameUtil.getImage("GameImage/GioGio.jpg");
    
    /**
     * 加载窗口
     */
    public void launchFrame(){
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
        
        new PaintThread().start();//线程启动
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
    
    private double x = 100,y = 100;
    //private boolean left;
    //private boolean up;
    private double degree; //[0,2pi]
    private double speed = 10;
    public void paint(Graphics g){
        
        
        g.drawImage(img, (int)x, (int)y, null);
        
        if(speed>0){
            speed -=0.05;
        }else{
            speed = 0;
        }
        x+=speed*Math.cos(degree);
        y+=speed*Math.sin(degree);
        
        if(y>500-30||y<30){
            degree = -degree;
        }
        if(x<0||x>500-30){
            degree = Math.PI-degree;
        }
        /*简化代码
        if(y>500-30){
            degree = -degree;
        }
        if(y<0){
            degree = -degree;
        }
        if(x<0){
            degree = Math.PI-degree;
        }
        if(x>500-30){
            degree = Math.PI-degree;
        }
        */
        /*
        if(left){
            x-=3;
        }else{
            x+=3;
        }
        if(x>500 - 30){
            left = true;
        }
        if(x<0){
            left = false;
        }
        
        if(up){
            y-=3;
        }else{
            y+=3;
        }
        if(y>500 - 30){
            up = true;
        }
        if(y<0){
            up = false;
        }
        */
    }
    
    /**
     * 定义一个重建窗口的线程类，内部类
     */
    
    class PaintThread extends Thread{
        
        public void run(){
            while(true){
                repaint();
                try {
                    Thread.sleep(50);//1s =1000ms
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[]args){
        GameFrame gf = new GameFrame();
        gf.launchFrame();
        
        
    }
}
