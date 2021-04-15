package chapter8;

import java.util.Scanner;

public class C8E6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        int count=0,sum=0;
        while(a!=0){
            sum+=a;
            a=scan.nextInt();
            count++;
        }
        System.out.println("sum " + sum);
        double average=(double)sum/count;
        System.out.println("average " + average);
        scan.close();
    }
}
