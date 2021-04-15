package chapter8;

import java.util.Scanner;

public class C8E12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number");
        int a = scan.nextInt();
        int sum=0;
        while (a / 10 > 0) {
                sum += a % 10;
                a = a / 10;
            }
        sum+=a;
        System.out.println(sum);
        scan.close();
    }
}
