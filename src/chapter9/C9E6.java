package chapter9;

import java.util.Scanner;

public class C9E6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum+=Math.pow(2,i);

        }
        System.out.println(sum);
        scan.close();
    }
}
