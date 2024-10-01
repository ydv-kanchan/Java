package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        for (String fruit : queue) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
