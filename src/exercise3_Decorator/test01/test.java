package exercise3_Decorator.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {

    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if(len<2){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for(int i=0;i<intervals.length; i++){
            System.out.println(Arrays.toString(intervals[i]));
        }
        System.out.println("=========");

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 0;i < intervals.length-1;i++){
            int[] curInterval = res.get(res.size()-1);


            if (curInterval[1]>=intervals[i+1][0]){
                if (curInterval[1]<=intervals[i+1][1]){
                    curInterval[1] = intervals[i+1][1];
                    res.set(res.size()-1,curInterval);
                    System.out.println(curInterval[0]+"=="+curInterval[1]);
                }
            }else{
                res.add(intervals[i+1]);
            }

        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
//        HouseBlend houseBlend = new HouseBlend();
//        Mocha mocha = new Mocha(houseBlend);
//        Soy soy = new Soy(mocha);
//        System.out.println(soy.getDescription() + ";cost:"+soy.cost());


        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        beverage.setSize(BeverageSize.GRANDE);
        System.out.println(beverage.getDescription()+"$"+beverage.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(BeverageSize.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+"$"+beverage3.cost());


        System.out.println(beverage3.getSize());



//        int[][] intervals = {{1, 4}, {0, 2}, {3, 5}, {15, 18}};
//        int[][] res = merge(intervals);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(Arrays.toString(res[i]));
//        }





    }


}
