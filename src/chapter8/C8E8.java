package chapter8;

import java.util.Scanner;

public class C8E8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        int min=0;
        if (a>0){
            min=a;
        }
        while(a>0){
            a=scan.nextInt();
            if(a<min&&a>0)
                min=a;
        }
        System.out.println("min = " +min);

        scan.close();
    }
}
