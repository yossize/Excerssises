package chapter8;

import java.util.Scanner;

public class C8E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=scanner.nextInt();
        int i=0;
        while (i<=n){
            if (i%2==0)
                System.out.print(i + " ");
            i++;
        }
        scanner.close();
    }
}
