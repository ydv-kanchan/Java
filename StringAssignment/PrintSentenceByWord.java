package StringAssignment;

import java.util.Scanner;

/*

SAMPLE INPUT:

IAmACompetitiveProgrammer

SAMPLE OUTPUT:

I
Am
A
Competitive
Programmer

EXPLANATION:

There are 5 words in the string.

 */

public class PrintSentenceByWord {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] result = input.split("(?=[A-Z])");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}