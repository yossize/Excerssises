package chapter6;

import java.util.Scanner;

public class C6E4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a = scan.nextInt();
        int count=0;
        if ((a%10)>0){
            count+=1;
            a=a/10;
        }
        if ((a%10)>0){
            count+=1;
            a=a/10;
        }
        if ((a%10)>0){
            count+=1;
            a=a/10;
        }
        if ((a%10)>0){
            count+=1;
            a=a/10;
        }
        System.out.println("number of digits is " + count);
        scan.close();

    }
}
