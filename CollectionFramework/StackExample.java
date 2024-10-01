package CollectionFramework;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.add("apple"); //list method
        s.push("banana"); //stack method
        s.push("cherry");
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s);
        s.pop(); //removes cherry as LIFO 
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.search("banana"));
        System.out.println(s.search("cherry"));
        System.out.println(s.isEmpty());
    }
}
