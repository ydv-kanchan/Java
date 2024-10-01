package StringAssignment;
import java.util.Scanner;
public class maxCharOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] freq = new int[256];  // Array to store frequency of each character (supporting ASCII)

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find the character with maximum frequency
        char maxChar = s.charAt(0);
        int maxFreq = freq[maxChar];

        for (int i = 1; i < s.length(); i++) {
            if (freq[s.charAt(i)] > maxFreq) {
                maxChar = s.charAt(i);
                maxFreq = freq[s.charAt(i)];
            }
        }

        // Print the character with the maximum frequency
        System.out.println(maxChar);
        System.out.println(freq.length);
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i]);
        }
        sc.close();
    }
}
