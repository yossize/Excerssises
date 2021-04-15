package chapter9;

import java.util.Scanner;

public class C9E3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int N=scan.nextInt();
        int sum=1;
        for(int i=1;i<=N;i++){
            sum*=i;
        }
        System.out.println(sum);
        scan.close();
    }
}
