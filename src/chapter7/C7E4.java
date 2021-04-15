package chapter7;

import java.util.Scanner;

public class C7E4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter year");
        int year=scan.nextInt();
        if(((year%4==0)&&(year%100!=0))||year%400==0)
            System.out.println("leap year");
        else
            System.out.println("the year isnt leap");
        scan.close();
    }
}
