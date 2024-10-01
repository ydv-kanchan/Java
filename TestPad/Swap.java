package TestPad;

import java.util.*;
public class Swap {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int temp = n;
    n = m;
    m = temp;
    System.out.println(n);
    System.out.println(m);
    sc.close();
  }
}
