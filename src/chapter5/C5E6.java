package chapter5;

import java.util.Scanner;

public class C5E6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter name");
        String name=scan.nextLine();
        System.out.println("please enter salary");
        float salary=scan.nextFloat();
        if(salary*1.1>6000) {
            salary = salary * 1.05f;
        }
            else{
                salary=salary*1.1f;
            }
        System.out.println(name + " "+"your new salary is " + salary);
        }

}
