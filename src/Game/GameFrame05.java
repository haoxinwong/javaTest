/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author WarSpite
 */
public class GameFrame05 extends MyFrame{
    Image img = GameUtil.getImage("GameImage/a.png");
    private double x = 100,y = 100;
    //private boolean left;
    //private boolean up;
    private double degree = 3.14/3; //[0,2pi]
    public void paint(Graphics g){
        g.drawImage(img, (int)x, (int)y, null);
        
        x = 100+100+Math.cos(degree);
        y = 200+50+Math.cos(degree);
        degree+=0.1;
        g.drawImage(img, (int)x, (int)y, null);
        
    }
    
    public static void main(String[]args){
        GameFrame gf = new GameFrame();
        gf.launchFrame();
        
        
    }
}
