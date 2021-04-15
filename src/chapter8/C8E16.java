package chapter8;

import java.util.Scanner;

public class C8E16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        System.out.println("please enter number");
        int b=scan.nextInt();
        int sum=0,i=0;
        while(i<b){
            sum+=a;
            i++;
        }
        System.out.println(sum);
        scan.close();
    }
}
