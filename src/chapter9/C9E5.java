package chapter9;

import java.util.Scanner;

public class C9E5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<10;i++){
            System.out.println("please enter a number");
            int a =scan.nextInt();
            if(i%3==0) {
                sum += a;

            }
        }
        System.out.println(sum);
        scan.close();
    }
}
