/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author WarSpite
 */

public class MyFrame extends Frame{
    
    
    
    /**
     * 加载窗口
     */
    public void launchFrame(){
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(100,100);
        setVisible(true);
        
        new GameFrame.PaintThread().start();//线程启动
        
        addWindowListener(new WindowAdapter(){
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
    
}
