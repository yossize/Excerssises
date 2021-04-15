package chapter8;

import java.util.Scanner;

public class C8E9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int siduri=1;
        int a =scan.nextInt();
        int max=a;
        int i=1;
        while (i<10){
            a=scan.nextInt();
            i++;
            if(a>max) {
                max = a;
                siduri=i;
            }

        }
        System.out.println("siduri = " + siduri + " max = " + max);
        scan.close();
    }
}
