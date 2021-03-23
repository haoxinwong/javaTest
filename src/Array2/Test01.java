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
public class Test01 {
    public static void main(String[]args)
    {
        int[][] a = {
            {1,2},
            {3,4,0,9},
            {5,6,7}
        };
                
        int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[4];
        b[2] = new int[3];
        b[0][0] = 1;
        b[0][1] = 3;
        b[1][0] = 2;
        b[1][1] = 5;
        b[1][2] = 8;
        b[1][3] = 9;
        
        b[2][0] = 3;
        b[2][1] = 2;
        b[2][2] = 4;
        
        
        
    }
}
