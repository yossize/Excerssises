package chapter10;

import java.util.Random;

public class C10E4 {
    public static void main(String[] args) {
        Random R = new Random();
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i <= 170; i++) {
            switch (R.nextInt(4)+1) {
                case 1:
                    count1++;
                    break;
                case 2:
                  count2++;
                 break;
                case 3:
                    count3++;
                    break;
                case 4:
                    System.out.println("country " + i + " voted Veto");
                    break;
            }
        }
        System.out.println("in favor " + count1);
        System.out.println("against " + count2);
        System.out.println("nimna " + count3);
    }
}
