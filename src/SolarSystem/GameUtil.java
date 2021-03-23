/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import Game.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * 游戏开发中常用的工具类（比如加载图片等方法）
 * @author WarSpite
 */
public class GameUtil {
    private GameUtil(){}//工具类通常会将构造方法私有了
    public static Image getImage(String path){
        /*
        URL u = GameUtil.class.getClassLoader().getResource(path);
        Image img = null;
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
        }
        */
        return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
    }
}


