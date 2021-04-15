package chapter8;

import java.util.Scanner;

public class C8E19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=scan.nextInt();
        int i=1,sum=1;
        while(i<=num){
            sum*=i;
            i++;
        }
        System.out.println("atzeret is " + sum);
        scan.close();
    }
}
