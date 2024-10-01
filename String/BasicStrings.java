package String;

public class BasicStrings {
    public static void main(String[] args) {
        String str0 = "Kancahn"; //using litral, goes in string intern pool
        String str1 = "Kanchan"; //using litral, refer to the str0 in the string pool
        String str2 = new String("Kanchan"); //using new, makes new instance
        String str3 = new String("Kancahan"); //using new, makes another instance in heap even though same content already exist in pool and heap as well

        // == checks same reference and .equals check same content
        System.out.println(str0 == str1);
        System.out.println(str2 == str3);
        String str4 = "Hello";
        String[] result = str4.split(",");  // No comma in the string
        for (int i = 0; i < result.length; i++) {
           System.out.println(result[i] + " ");
        }
        String str5 = "Kanchan";
        String str6 = "kanchan";
        System.out.println(str5.compareTo(str6));
    }
}


/*
 * Declaration:
   1. using string litral "":
      1.1 -when we declare string like this then the string goes in the string pool in heap,
      1.2 -here if two different variables have same content then it will refer to the same memory location in pool
      1.3 -here if we reinitialise a string then the original string will be no longer accessible, and will be deleted by java after some time

   2. using new keyword
      2.1 -when we declare strin like this then a new instance is made in heap memory,
      2.2 -even if two variables will have same content using new keyword, then new instance will be created in heap
      2.3 -here if we reinitialise a string then the original string will be unaccessible, and will be deleted by java after some time


 *  Immutablility:
    string are immutable in java, but there's no error because you're not trying to modify the original string in place; 
    instead, you're simply assigning a new string to the same variable, the original content will be lo longer accessible.

 *String pool:
   It is also known as string intern pool, is a special memory region in java heap.
   it stores litrals to optimize memory usage and improve performace,
   when is string pool important?
   1.memory optimization: reduces memory overhead, if you have repeated strings in your program
   2. performace: comparisions between strings in pool == is faster
   because it compares references, not values.
   3.string interning: you can manually add strings to pool using intern() method.
   
 */