package TestPad;

import java.util.*;
public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double per = (double) total / 500 * 100;
        System.out.println(total+" "+(int)per);
        sc.close();
    }
}
