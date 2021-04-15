package chapter9;

import java.util.Scanner;

public class C9E9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        for(int i=a;i<=b;i=i+c){
            System.out.println(Math.pow(a,2)+5);
            a+=c;
        }
        scan.close();
    }
}
