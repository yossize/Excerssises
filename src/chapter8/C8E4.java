package chapter8;

import java.util.Scanner;

public class C8E4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number");
        int den = scan.nextInt();
        System.out.println("please enter number");
        int max = scan.nextInt();
        int i=1;
        while (i<=max){
            if(i%den==0) {
                System.out.print(i+" ");
            }
            i++;
        }

        scan.close();
    }
}
