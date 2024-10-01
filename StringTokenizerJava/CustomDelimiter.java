package StringTokenizerJava;
import java.util.StringTokenizer;

public class CustomDelimiter {
    static void main(String args[]) {
        String input = "Apple,Mango:Banana;Kiwi%guava@organe";
        String delim = ",:;%@";
        StringTokenizer token = new StringTokenizer(input, delim);
        while (token.hasMoreElements()) {
            System.out.println(token.nextElement());
        }
    }
}
