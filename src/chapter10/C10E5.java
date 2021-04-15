package chapter10;

import java.util.Random;
import java.util.Scanner;

public class C10E5 {
    public static void main(String[] args) {
        Random R=new Random();
        int sum1=0,sum2=0,sum3=0,val=0;
        for (int i=1;i<=1000;i++){
            val=R.nextInt(4000)+1;
            System.out.println("val "+val);
            if(val<1000){
                sum1++;
                continue;
            }
            if(val<2000){
                sum2++;
                continue;
            }
            sum3++;
            }
        System.out.println("sum1 " + sum1);
        System.out.println("sum2 " + sum2);
        System.out.println("sum3 " + sum3);
        }
}
