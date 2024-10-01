package CollectionFramework;

import java.util.*;

public class MirrorQueue {
    
    static void mirrorQueue(Queue<String> q){
        Stack<String> s = new Stack<>();
        int qSize = q.size();
        for(int i=0;i<qSize;i++){
            String elm = q.poll();
            q.offer(elm);
            s.push(elm);
        }
        int sSize = s.size();
        for(int i=0;i<sSize;i++){
            String elm = s.pop();
            q.offer(elm);
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String elm = sc.next();
            q.offer(elm);
        }
        mirrorQueue(q);
        System.out.println(q);
        sc.close();
    }
}
