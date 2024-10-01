public class MemoryAllocation {
    public static void main(String[] args) {
        // String literals
        String str1 = "neeraj";
        str1 = "neerajasdfg";

        // Strings created using the new keyword
        String str3 = new String("sharma");
        String str4 = new String("sharma");

        // Checking reference equality
        // System.out.println(str1 == str2);  // true
        System.out.println(str3 == str4);  // false

        // Checking content equality
        // System.out.println(str1.equals(str2));  // true
        System.out.println(str3.equals(str4)); // true
        
        System.out.println(str1);
    }
}
