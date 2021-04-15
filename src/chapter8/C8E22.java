package chapter8;

import java.util.Scanner;

public class C8E22 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        int value=scan.nextInt();
        int i=1,j=1,tmp=0,location=2;
        System.out.println("please enter value");
        System.out.print("1"+" 1 ");
        while (tmp<value){
            tmp=j+i;
            System.out.print(tmp+ " ");
            i=j;
            j=tmp;
            location++;
        }
       // System.out.println(j);
    
    scan.close();
    }
}
