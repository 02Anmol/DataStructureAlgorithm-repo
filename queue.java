import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        // Queue: FIFO data structure. First-In-First_Out. A collection designed for holding elements prior to processing Linear data structure

        // add = enqueue, offer().....at end
        // remove = dequeue, poll()...at top

        Queue<String> queue = new LinkedList<String>(); 

        // System.out.println(queue.isEmpty());


        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        queue.offer("Date");

        System.out.println(queue.size());

        System.out.println(queue.contains("Apple"));



        System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);

        // where are queue are usefull?
        // -> Keyboard buffer (letters should appear on the screen in the order ther're pressed)
        // -> Job scheduler (first come first served)
        // -> Banker's queue (customers are served in the order they arrive)
        // -> Print queue (print jobs are printed in the order they are submitted)
        // -> used in LinkedList, PriorityQueue, BFS 

    }
}
