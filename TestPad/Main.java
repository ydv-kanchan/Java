package TestPad;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Initialize the map using double-brace initialization
        HashMap<String, String> map = new HashMap<String, String>() {{
            put("two", "deux");
            put("five", "cinq");
            put("one", "un");
            put("three", "trois");
            put("four", "quatre");
        }};

        // Create an instance of the class and call the method
        Main instance = new Main();
        instance.HashMapCQ1(map);
    }

    public void HashMapCQ1(HashMap<String, String> map) {
        HashMap<String, String> out = new HashMap<>();
        for (String k : map.keySet()) {
            String v = map.get(k);
            if (k.charAt(0) <= v.charAt(0)) {
                out.put(k, v);
            } else {
                out.put(v, k);
            }
        }
        System.out.println(out);
    }
}
