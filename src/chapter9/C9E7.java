package chapter9;

import java.util.Scanner;

public class C9E7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for(int i=1;i<=a;i++){
            System.out.print(i*2+" ");
        }
        scan.close();
    }
}
