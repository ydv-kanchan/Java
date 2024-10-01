package StringTokenizerJava;
import java.util.StringTokenizer;

public class CountTokens {
    static public void main(String args[]) {
        String str = "Apple,Mango:Banana;Kiwi%guava@organe";
        StringTokenizer token = new StringTokenizer(str, ",:;%@", true);

        System.out.println("number of tokens: " + token.countTokens());
        
        while (token.hasMoreElements()) {
            System.out.println(token.nextElement());
        }
    }
}
