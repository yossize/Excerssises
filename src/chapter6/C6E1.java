package chapter6;

import java.util.Scanner;

public class C6E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int a =scan.nextInt();
        if(a==0){
            System.out.println("you entered zero");
        }
        else if (a>0){
            System.out.println("you entred positive");
        }else{
            System.out.println("you entered negative");
        }
        scan.close();
    }
}
