package chapter9;

import java.util.Scanner;

public class C9E13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0,sum=0;
        for(int i=0;i<10;i++){
            System.out.println("please enter a number");
            a=scan.nextInt();
            if(i%2==0){
                sum+=a;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
