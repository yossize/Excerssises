package chapter8;

import java.util.Scanner;

public class C8E23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int j=scan.nextInt();
        int i=1;
        while(i<=j){
            if(j%i==0){
                System.out.print(i+" ");
        }
            i++;
        }
        scan.close();
    }
}
