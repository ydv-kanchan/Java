package CollectionFramework;
import java.util.*;

public class ArrayQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(5);
        System.out.println(queue.size()); //5
        queue.add("Apple");
        queue.add("Banana");
        queue.offer("Cherry");
        queue.offer("Kiwi");
        queue.add("Orange"); //queue is full
        System.out.println(queue);
        System.out.println(queue.peek());// gives head, FIFO
        System.out.println(queue.remove()); //FIFO
        queue.add("Mango");
        for (String fruit : queue) {
            System.out.print(fruit+" ");
        }
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
