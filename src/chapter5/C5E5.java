package chapter5;

import java.util.Scanner;

public class C5E5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        System.out.println("please enter a number");
        int b=scan.nextInt();
        if(a==b){
            System.out.println("shavim" + a+" " + b);
        }else
        System.out.println(Math.min(a,b)+" "+Math.max(a,b));

        scan.close();
    }
}
