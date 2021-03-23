/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCollection;

/**
 * 模拟实现JDK中提供的ArrayList类
 *
 *
 * @author WarSpite
 */
public class MyArrayList {

    private Object[] value;

    private int size;

    public MyArrayList() {
        //value = new Object[16];
        this(10);
    }

    public MyArrayList(int size) {
        if (size < 0) {
            try {
                throw new Exception();//手动异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        value = new Object[16];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object obj) {
        value[size] = obj;
        size++;
        if (size >= value.length)//扩容
        {
            int newCapacity = value.length * 2 + 2;
            Object[] newList = new Object[newCapacity];
            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }
            value = newList;
        }
    }

    public Object get(int index) {
        rangeCheck(index);
        return value[index];

    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = 1; i < value.length; i++) {
                if (obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = value.length - 1; i >= 0; i--) {
                if (obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Object set(int index, Object object) {
        rangeCheck(index);
        Object old = value[index];
        value[index] = object;
        return old;
    }

    public void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();//手动异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);
        list.add("aaa");
        list.add(new Human("浩"));
        list.add("bbbb");

        Human h = (Human) list.get(1);
        System.out.println(h.getName());

        //System.out.println(list.get(3));
        System.out.println(list.size());

    }
}
