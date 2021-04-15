package chapter8;

import java.util.Scanner;

public class C8E1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter top");
        int top=scan.nextInt();
        int i=1;
        while(i<=top){
            System.out.print(i+ " ");
            i++;
        }
        scan.close();
    }
}
