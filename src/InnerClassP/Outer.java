/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassP;

/**
 *
 * @author WarSpite
 */
public class Outer {
    public static void main(String[] args){
        Face f = new Face();
        Face.Nose n = f.new Nose();
        n.breath();
        Face.Ear e = new Face.Ear();
        e.listen();
        
    }
    
}

class Face{
    int type  = 20;
    String shape = "瓜子脸";
    static String color = "red";
    
    class Nose{
        String shape;
        
        void breath(){
            System.out.println(Face.this.shape);
            System.out.println(Face.this.type);//访问外部type; this.type访问内部type
            System.out.println("呼吸");
        }
    }
    
    static class Ear{
        void listen(){
            //System.out.println(shape);静态不能调非静态
            System.out.println(color);//能访问静态属性
            System.out.println("我在听");
        }
    }
}