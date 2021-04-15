package chapter9;

import java.util.Scanner;

public class C9E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        int a =scan.nextInt();
        System.out.println("please enter second number");
        int b =scan.nextInt();
        int tmp=0;
        if(a>b){
            tmp=b;
            b=a;
            a=tmp;
        }
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
        }
        scan.close();
    }
}
