package chapter5;

import java.util.Scanner;

public class C5E4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        System.out.println("please enter a number");
        int b=scan.nextInt();
        if(a%b==0){
            System.out.println("first modulo second - no sheerit");
        }
        if(b%a==0){
            System.out.println("second modulo first - no sherit");
        }
        scan.close();
    }
}
