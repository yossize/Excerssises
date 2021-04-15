package chapter9;

import java.util.Scanner;

public class C9E8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%4==0||i%7==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
