package chapter10;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class C10E1 {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("please enter a number");
      //  int prev= scan.nextInt();
        Random rand=new Random();
        int prev=rand.nextInt(100)+1;
        int curr=0;
        System.out.println("prev " + prev);
        for (int i=1;i<100;i++){
       //     System.out.println("please enter a number");
       //     curr= scan.nextInt();
            curr=rand.nextInt(100)+1;
            System.out.println("curr " + curr);
            if (curr>prev){
                prev=curr;
                continue;
            }else{
                System.out.println("not ordered");
                return;
            }
        }
        System.out.println("ordered");
        // scan.close();
    }

}
