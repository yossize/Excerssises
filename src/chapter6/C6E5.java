package chapter6;

import java.util.Scanner;

public class C6E5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter name");
        String name=scan.nextLine();
        System.out.println("please enter your salary");
        double salary=scan.nextFloat();
        double tax=0;
        if(salary<23000)
            tax=salary*0.1;
        else if(salary<46000)
            tax=23000*.1+(salary-23000)*.2;
        else if(salary<12000)
            tax=23000*.1+23000*.2+(salary-46000)*.3;
        else if(salary<220000)
                tax=(salary-220000)*.4+23000*.1+23000*.2+46000*.3;
        System.out.println("tax is " + tax);
         scan.close();
    }
}
