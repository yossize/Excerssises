package chapter8;

import java.util.Scanner;

public class C8E11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a = scan.nextInt();
        int tmp=a/10;
        int numOfDigits=1;
        if (a>0){
            while(tmp>0){
                numOfDigits++;
                tmp/=10;
            }
        }
        System.out.println("num. of digits " + numOfDigits);
        scan.close();
    }
}
