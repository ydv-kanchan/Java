import java.util.Scanner;

public class MultiplyStringsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        // Get the lengths of both numbers
        int len1 = num1.length();
        int len2 = num2.length();

        // Create an array to store the product results
        int[] product = new int[len1 + len2];

        // Multiply each digit of num1 with each digit of num2
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0'; // Convert character to integer
            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0'; // Convert character to integer

                int multiply = digit1 * digit2; // Multiply the digits
                int pos1 = i + j;  // Position for carry (tens place)
                int pos2 = i + j + 1;  // Position for the unit place

                int sum = multiply + product[pos2]; // Add to the existing value in product array

                // Update the carry and the current position
                product[pos1] += sum / 10;  // Carry to the next position
                product[pos2] = sum % 10;   // Store the unit digit at the current position
            }
        }

        // Build the final product number by skipping leading zeros
        String result = "";
        boolean leadingZero = true;

        for (int value : product) {
            if (!(leadingZero && value == 0)) { // Skip leading zeros
                leadingZero = false;  // Once we find a non-zero digit, stop skipping
                result += value;  // Append the digit to the result
            }
        }

        // If result is empty, it means the result is zero
        if (result.isEmpty()) {
            result = "0";
        }

        // Print the final result
        System.out.println("Multiplication Result: " + result);
        sc.close();
    }
}
