package chapter8;

import java.util.Scanner;

public class C8E10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("pease enter number");
        int a=scan.nextInt();
        int left=a/10;
        if (left>0){
            while(left>0){
                a=left;
                left/=10;
            }
        }
        System.out.println(a);

        scan.close();
    }
}
