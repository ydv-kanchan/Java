package StringBuilder;
public class BasicStringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuilder sb = new StringBuilder("Hello");

        // Appending
        sb.append(" World");
        System.out.println("After Append: " + sb);  // Hello World

        // Inserting
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);  // Hello Java World

        // Replacing
        sb.replace(6, 10, "Awesome");
        System.out.println("After Replace: " + sb);  // Hello Awesome World

        // Deleting
        sb.delete(6, 14);
        System.out.println("After Delete: " + sb);  // Hello World

        // Reversing
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // dlroW olleH

        // Capacity and Length
        System.out.println("Capacity: " + sb.capacity());  // Typically larger than length
        System.out.println("Length: " + sb.length());      // Length of the string
    }
}
