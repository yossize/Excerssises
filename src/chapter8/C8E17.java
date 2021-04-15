package chapter8;

import java.util.Scanner;

public class C8E17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        System.out.println("please enter number");
        int b=scan.nextInt();
        int sum=a,i=1;
        while(i<b){
            sum*=a;
            i++;
        }
        System.out.println(sum);
        scan.close();

    }
}
