package StringTokenizerJava;

import java.util.StringTokenizer;

public class TokenizerDemo {
    static void main(String arg[]) {
        String in = "Java is a powerful language";

        StringTokenizer token = new StringTokenizer(in);

        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
