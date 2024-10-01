package CollectionFramework;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");     
        list.add("Banana");
        list.addFirst("Orange"); 
        list.addLast("Mango");  
        list.offer("Cherry");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println(list);
        ListIterator<String> listIterator = list.listIterator(list.size());
        ListIterator<String> listIterator2 = list.listIterator();
        while (listIterator.hasPrevious()) {
            String ele = listIterator.previous();
            System.out.print(ele + " ");
        }
        System.out.println();
        while (listIterator2.hasNext()) {
            String ele = listIterator2.next();
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(list.size());
    }
}
