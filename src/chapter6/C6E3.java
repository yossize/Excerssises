package chapter6;

import java.util.Scanner;

public class C6E3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a==b&&b==c){
            System.out.println("all are equal");
        }else {
            System.out.println(Math.max(c, Math.max(a, b)));
        }
        scan.close();
    }
}
