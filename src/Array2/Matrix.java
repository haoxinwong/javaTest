/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2;

import java.util.Arrays;

/**
 *
 * @author WarSpite
 */
public class Matrix {
    /*
    矩阵打印
    */
    public static void print(int[][]c)
    {
        for(int i = 0;i<c.length;i++)
        {
            for(int j = 0;j<c.length;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /*
    矩阵加法
    */
    public static int[][]add(int[][]a,int[][]b)
    {
        int[][] c = new int[a.length][a.length];
        for(int i = 0;i<c.length;i++)
        {
            for(int j = 0;j<c.length;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static void main(String[]args)
    {
        int[][] a  = {
            {1,3},
            {2,4}
        };
        int[][] b  = {
            {3,4},
            {5,6}
        };
        int[][] c = add(a,b);
        //print(c);
        int[]test = {1,2,2,13,134,322,1};
        Arrays.sort(test);//使用二分法查找必须先对数组进行排序
        //System.out.println(test);
        System.out.println(Arrays.toString(test));
        
        System.out.println("该元素的索引，"+Arrays.binarySearch(test, 13));
        
        //一样的这两个
        int[]test2 = {1,2,323,23,543,12,59};
        for(int i = 0;i<test2.length;i++)
        {
            int t = test2[i];
            System.out.println(t);
        }
        for(int i:test2)
        {
            System.out.println(i);
        }
    }
    
}
