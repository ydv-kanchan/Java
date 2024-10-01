package StringAssignment;

import java.util.Scanner;
public class isPalindrome {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean palindrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrome = false;
            }
        }
        System.out.println(palindrome);
        sc.close();
    }
}
