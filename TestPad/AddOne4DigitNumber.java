package TestPad;

import java.util.*;
public class AddOne4DigitNumber {
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //long, placeValue = 1, newN = 0
    long n = sc.nextInt();
    if (n <= 0) {
        System.out.println(n + 1);
    }
    else {
    long newN = 0;
    int placeValue = 1;
    while (n > 0) {
        long remain = n % 10;
        remain = (remain + 1) % 10;
        newN += remain * placeValue;
        placeValue *= 10;
        n /= 10;
    }
    System.out.println(newN);
    }
    sc.close();
  }
}
