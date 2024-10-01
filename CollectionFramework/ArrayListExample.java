package CollectionFramework;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add(0, "Orange");
        list.add("Mango");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println(list);
        ListIterator<String> listIterator = list.listIterator(list.size());
        ListIterator<String> listIterator2 = list.listIterator();
        System.out.println("Iterating backwards:");
        while (listIterator.hasPrevious()) {
            String ele = listIterator.previous();
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Iterating forwards:");
        while (listIterator2.hasNext()) {
            String ele = listIterator2.next();
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(list.size());
    }
}
