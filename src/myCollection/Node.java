/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCollection;

/**
 *
 * @author WarSpite
 */
public class Node {
    Node previous;
    Object obj;
    Node next;
    
    public Node(){
        
    }
   
    public Node(Object previous, Object obj, Object next){
        super();
        this.previous = previous;
        this.obj = obj;
        this.next = next;
    }
    public Object getPrevious(){
        return previous;
    }
    public void setPrevious(Object previous){
        this.previous = previous;
    }
    
    public Object getNext(){
        return next;
    }
    public void setNext(Object next){
        this.next = next;
    }
    
    public Object getObj(){
        return obj;
    }
    public void setObj(Object obj){
        this.obj = obj;
    }
    
    
}
