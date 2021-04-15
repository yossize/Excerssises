package chapter9;

import java.util.Scanner;

public class C9E4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int N=scan.nextInt();
        int sum=0;
        for(int i=0;i<=N;i++){
            if (i%3==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
