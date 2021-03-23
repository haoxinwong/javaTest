/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

/**
 *
 * @author WarSpite
 */
public class PaintFrame {
    public static void drawFrame(MyFrame f)
    {
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        
        ///画窗口
        f.paint();
        
        System.out.println("d");
    }
    public static void main(String[]args)
    {
        drawFrame(new GameFrame01());
    }
    
}
class GameFrame01 extends MyFrame
{
    @Override
    public void paint()
    {
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
class GameFrame02 extends MyFrame
{
    @Override
    public void paint()
    {
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }
}