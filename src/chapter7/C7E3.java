package chapter7;

import java.util.Scanner;

public class C7E3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter mekadmim A to F");
        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double C=scan.nextDouble();
        double D=scan.nextDouble();
        double E=scan.nextDouble();
        double F=scan.nextDouble();
        if(A*E != B*D) {
            double x = ((C * E) + (B * F)) / ((A * E) - (B * D));
            double y = ((C * D) + (A * F)) / ((A * E) - (B * D));
            System.out.println("x= "+x+" "+"y= "+ " "+y);
        }else{
            System.out.println("no solution");
        }
        scan.close();
    }
}
