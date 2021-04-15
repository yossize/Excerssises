package chapter8;

import java.util.Scanner;

public class C8E24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int i=scan.nextInt();
        System.out.println("please enter second number");
        int j=scan.nextInt();
        int max=0;
        int index=1;
        while (index<=i&&index<=j){
            if(i%index==0&&j%index==0&&index>max){
                max=index;
            }
            index++;
        }
        System.out.println(max);
        scan.close();
    }
}
