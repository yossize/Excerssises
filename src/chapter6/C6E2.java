package chapter6;

import java.util.Scanner;

public class C6E2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        System.out.println("please enter a number");
        int b=scan.nextInt();
        System.out.println("please enter a number");
        int c=scan.nextInt();
        if((b>a)&&(c>b)){
            System.out.println("increasing");
        }
        scan.close();
    }
}
