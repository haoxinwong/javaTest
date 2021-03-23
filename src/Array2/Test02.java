/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2;

/**
 *
 * @author WarSpite
 */
public class Test02 {
    public static int nums = 41;
    public static int killMan = 3;
    public static void main(String[]args){
         int alive = 2;
         int[] man = new int[nums];// 未被杀的都被标记为0
         int pos = -1;// 数组角标
         int i = 0;
         int count = 1;// 杀到第几个记录值
 
         while (count <= nums) {
 
             do {
                 pos = (pos + 1) % nums;// 循环标记
                 if (man[pos] == 0)
                     i++;
 
                 if (i == killMan) {
                     i = 0; // 重置
                     break;// 找到了被杀的位置，跳出循环，进行标记
                 }
 
             } while (true);
             
             man[pos] = count;
             count++;
         }
 
         // 显示不被杀的位置
         alive = count - alive;
         System.out.println(alive);
         System.out.println(man.length);
         System.out.println();
         for (int j = 0; j < man.length; j++) {
             System.out.println(man[j]);
             if (man[j] >= alive)
                 System.out.println("不被杀的位置是->" + (j + 1));
 
         }
    }
}
