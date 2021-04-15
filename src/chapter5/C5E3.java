package chapter5;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C5E3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        scan.close();
    }
}
