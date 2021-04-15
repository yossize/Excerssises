package chapter10;

import java.util.Random;
import java.util.Scanner;

public class C10E3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter temprature");
        double temprature=scan.nextDouble();
        for(int i=0;i<=10;i++){
            System.out.println("please enter temprature");
            temprature=scan.nextDouble();
            if(temprature<-5||temprature>40){
                System.out.println("wrong data");
                return;
            }
        }
        System.out.println("correct data");
        scan.close();
    }
}
