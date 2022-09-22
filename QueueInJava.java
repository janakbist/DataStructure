package hamropatro.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
          Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            q.add(i);
        System.out.println(q);
        
        //to remove head of the queue
        int removedele = q.remove();
        System.out.println("removed element-"
                           + removedele);
 
        System.out.println(q);
 
        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-"
                           + head);
        int size = q.size();
        System.out.println("Size of the Queue is "+size);
    }
    
}
