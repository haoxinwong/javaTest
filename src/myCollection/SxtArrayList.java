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
public class SxtArrayList {
    
    private Object[] elementData;
    
    private int size;
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }
    
    public SxtArrayList(){
        this(10);//如果不赋予，默认10
    }
    
    public SxtArrayList(int initialCapacity){
        if(initialCapacity<0){
            try
            {   
                throw new Exception();//手动异常
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
        
    }
    
    public void add(Object obj){
        //数组扩容
        if (size>elementData.length){
            Object[]newArray = new Object[size*2+1];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            //for(int i = 0;i<elementData.length;i++){
            //    newArray[i] = elementData[i];
            //}
            elementData = newArray;
        }
        elementData[size] = obj;
        size++;
        
    }
    
    public Object get(int index){
        if(index<0||index>=size){
            try{
                throw new Exception();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        return elementData[index];
    }
    
    
}
