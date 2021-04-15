package chapter5;
import java.util.Scanner;

public class C5E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number : ");
        int a=scanner.nextInt();
        System.out.println("please enter number : ");
        int b=scanner.nextInt();
        if(Math.max(a,b)==b){
            System.out.println("GROWING");
        }

        scanner.close();
    }
}
