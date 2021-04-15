package chapter7;

import java.util.Scanner;

public class C7E1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println(Math.min(c,Math.min(a,b)));
        scan.close();
    }
}
