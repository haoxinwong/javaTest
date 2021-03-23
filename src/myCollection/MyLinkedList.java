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
public class MyLinkedList {
    private Node first;
    private Node last;
    
    private int size;
    
    public void add(Object obj){
        Node n = new Node();
        if(first == null){
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            
            first = n;
            last = n;
        }else{
            //直接往last节点后增加新的节点
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            
            last.setNext(n);
            
            last = n;
        }
        size++;
    }
    
    public int getSize(){
        return size;
    }
    
    public Object getObj(int index){
         if(first == null){
             
         }else{
             Node temp = first;
             while(temp.next!=null){
                 temp = temp.next;
                 
             }
         }
    }
    
    public static void main(String[]args){
        MyLinkedList list = new MyLinkedList();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list.getSize());
    }
}
