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
 * 游戏窗口类
 * @author WarSpite
 */
public class GameFrame extends Frame{  //GUI编程，AWT，swing等
    
    Image img = GameUtil.getImage("GameImage/a.png");
    
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
    private double degree = 3.14/3; //[0,2pi]
    private double speed = 10;
    public void paint(Graphics g){
        g.drawImage(img, (int)x, (int)y, null);
        
        x = 200+100*Math.cos(degree);
        y = 200+50*Math.sin(degree);
        degree+=0.1;
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
