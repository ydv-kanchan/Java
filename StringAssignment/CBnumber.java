package StringAssignment;
import java.util.Scanner;
public class CBnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String s = sc.next();
        int[] cbNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        boolean[] visited = new boolean[size];
        int count = 0;

        for (int length = 1; length <= size; length++) {
            for (int start = 0; start <= size - length; start++) {
                String subStr = s.substring(start, start + length);
                long num = Long.parseLong(subStr);

                if (num <= 1) continue;

                boolean isCB = true;
                for (int i = 0; i < cbNumbers.length; i++) {
                    if (num == cbNumbers[i] || num % cbNumbers[i] == 0) {
                        if (num != cbNumbers[i]) isCB = false;
                        break;
                    }
                }

                if (isCB) {
                    boolean used = false;
                    for (int i = start; i < start + length; i++) {
                        if (visited[i]) {
                            used = true;
                            break;
                        }
                    }
                    if (!used) {
                        for (int i = start; i < start + length; i++) {
                            visited[i] = true;
                        }
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
