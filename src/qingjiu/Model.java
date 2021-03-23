/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qingjiu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

/**
 *
 * @author WarSpite
 */
public class Model {
    //安照要求，做一个main
    public static void main(String[]args){
        //创建三个FP  (FootballPlayer，因为太长，以下化简为FP）
        //分别是a,b,c 
        //像a一样创建b,c,我就不写了
        //报错了再写
        Height aH = new Height(5,5);
        FootballPlayer a = new FootballPlayer(1,    "hao", "back field",
                                              aH,140,   "philly",
                                              "central high school");
        
        Height bH = new Height(5,3);
        FootballPlayer b = new FootballPlayer(2,    "hal", "mid field",
                                              bH,152,   "philly",
                                              "central high school");
        
        Height cH = new Height(5,5);
        FootballPlayer c = new FootballPlayer(3,    "wang", "halfway line",
                                              cH,150,   "philly",
                                              "central high school");
        //我心软了，帮你三个都写了
        
        
        //这里创建一个2d array
        //用于compare their height
        /*
        int [][] heightCompare = new int[3][2];//3列，两行
        //手动输入，我不知道怎么写forloop
        //如果height报错，那就趁FP 不注意把private Height height, 改成public
        heightCompare[0][0] = a.height.getFeet();
        heightCompare[0][1] = a.height.getInches();
        heightCompare[1][0] = b.height.getFeet();
        heightCompare[1][1] = b.height.getInches();
        heightCompare[2][0] = c.height.getFeet();
        heightCompare[2][1] = c.height.getInches();
        */
        
        //不好意思，我上面写混了
        //马上重新写一个还给你
        int [] heightCompare2 = new int[3];
        //1 feet = 12 inches;
        heightCompare2[0] = a.height.getFeet()*12+a.height.getInches();
        heightCompare2[1] = b.height.getFeet()*12+b.height.getInches();
        heightCompare2[2] = c.height.getFeet()*12+c.height.getInches();
        //将他们变为数字来比较，单位inches
        //开始比较
        Arrays.sort(heightCompare2);
        //获得已经sort好的heightCompare2
        //等等，用hashmap会简单一点，我再写一个
        //上面写的heightCompare2 和heightCompare 作废谢谢
        Map<FootballPlayer, Integer> map = new HashMap<FootballPlayer, Integer>();
        List<Map.Entry<FootballPlayer, Integer>> list = new ArrayList<>();
        map.put(a,(a.height.getInches()+a.height.getFeet()*12));
        map.put(b,(b.height.getInches()+b.height.getFeet()*12));
        map.put(c,(c.height.getInches()+c.height.getFeet()*12));
        for(Map.Entry<FootballPlayer, Integer> entry : map.entrySet()){
             list.add(entry); //将map中的元素放入list中
        }
        list.sort(new Comparator<Map.Entry<FootballPlayer, Integer>>(){
              @Override
               public int compare(Map.Entry<FootballPlayer, Integer> o1, Map.Entry<FootballPlayer, Integer> o2) {
                    return o2.getValue()-o1.getValue();} 
                   //逆序（从大到小）排列，正序为“return o1.getValue()-o2.getValue”
        }); 
        //打印从高到低人名和身高
        int count = 1;
        System.out.println("Display player's height from tall to short:");
         for(Map.Entry<FootballPlayer, Integer> entry: list){
              System.out.println(count+": "+entry.getKey().getName()+" is "+entry.getKey().height.instance());
              count+=1;
        }
        
        
    }
    
}
