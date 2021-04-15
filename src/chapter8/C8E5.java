package chapter8;

import java.util.Scanner;

public class C8E5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        int sum=0;
        while(a!=-99){
            sum+=a;
            a=scan.nextInt();
        }
        System.out.println("sum= " + sum);
        scan.close();
    }
}
