/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlaneGame;

import Game.GameFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author WarSpite
 */
public class MyGameFrame extends JFrame{
    
    Image ball = GameUtil.getImage("GameImage/a.png");
    
    private double x = 100,y = 100;
    private double degree = 3.14/3; //[0,2pi]
    private double speed = 10;
    public void paint(Graphics g){//自动被调用，g相当于一支画笔
        super.paint(g);
        
        g.drawImage(ball, (int)x, (int)y, null);
        
        x = 200+100*Math.cos(degree);
        y = 200+50*Math.sin(degree);
        degree+=0.1;
        
    
    }
    
    public void lunchFrame(){
        this.setTitle("po");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(100,100);
        
        new PaintThread().start();
        /**
         * 关闭窗口
         */
        this.addWindowListener(new WindowAdapter(){ 
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
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
        MyGameFrame f = new MyGameFrame();
        f.lunchFrame();
    }
    
}
