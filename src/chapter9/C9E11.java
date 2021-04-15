package chapter9;

import java.util.Scanner;

public class C9E11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        for(int i=0;i<=a;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for(int j=a;j>=0;j--){
            System.out.print(j+" ");
        }
        scan.close();

    }
}
