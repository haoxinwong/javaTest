/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import java.awt.Graphics;
import java.awt.Image;

/**
 * 太阳系的主窗口
 * @author WarSpite
 */
public class SolarFrame extends MyFrame{
    Image bg = GameUtil.getImage("image/GioGio.jpg");
    
    publci void paint(Graphics g)
    {
        g.drawImage(bg,0,0,null);
    }
    public static void main(String[]args){
        new SolarFrame().launchFrame();
    }
    
}
