package chapter8;

import java.util.Scanner;

public class C8E7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        int max=0;
        if(a>0)
            max=a;
        while (a>0){
            a=scan.nextInt();
            if(a>max)
                max=a;
        }
        System.out.println("max= "+ max);
        scan.close();
    }
}
