/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode;

/**
 *
 * @author WarSpite
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        for(int i = 0; i<nums.length;i++){
        //    if (nums[i]<=target){
                int temp = target-nums[i];
                for (int j = i+1;j<nums.length;j++){
                    if (temp == nums[j]){
                        ans[0] = i;
                        ans[1] = j;
                        
                    }
                }
           // }
           /* if (nums[i]>=target){
                int temp2 = target+nums[i];
            }*/
        }
        return ans;
    }
    public static void main(String[]args){
        int[]a = {-1,-2,-3,-4,-5};
        int b = -8;
        int []c;
        c = twoSum(a,b);
        for(int i = 0; i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
