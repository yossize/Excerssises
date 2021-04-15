package chapter8;

import java.util.Scanner;

public class C8E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b<a) {
            int tmp = 0;
            tmp=a;
            a=b;
            b=tmp;
        }
        int i =a;
        while (i<=b){
            System.out.print(i+" ");
            i++;
        }
        scan.close();
    }
}
