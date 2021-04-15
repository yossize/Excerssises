package chapter7;

import java.util.Scanner;

public class C7E2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter grade");
        double grade=scan.nextDouble();
        if(grade<55)
            System.out.println("Bilty Maspik");
        else if(grade<=64)
            System.out.println("Maspik");
        else if(grade<=74)
            System.out.println("kimat tov");
        else if(grade<=84)
            System.out.println("TOV");
        else if(grade<=94)
            System.out.println("TOV MEOD");
        else
            System.out.println("Metsoyan");
        scan.close();
    }
}
