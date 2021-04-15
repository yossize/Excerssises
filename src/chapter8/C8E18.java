package chapter8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C8E18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number");
        int a = scan.nextInt();
        System.out.println("please enter number");
        int b = scan.nextInt();
        int count=0;
        if (a<b){
            System.out.println("mana is zero");
            System.out.println("sheerit is " + a);
        }else {
            while (a > b) {
            count++;
            a=a-b;
            }
            System.out.println("mana is " + count + "sherit is " + a);
        }

    }
}
