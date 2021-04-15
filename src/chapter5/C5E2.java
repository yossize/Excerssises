package chapter5;
import java.util.Scanner;
public class C5E2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number");
        int a=scanner.nextInt();
        System.out.println("please enter number:");
        int b=scanner.nextInt();
        if(a==b){
            System.out.println("shavim");
        }else{
            System.out.println(Math.max(a,b));
        }
        scanner.close();
    }
}
