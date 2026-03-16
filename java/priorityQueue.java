import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        // Priority Queue: A FIFO data structure that serves elements with the highest priorities first before elements with lower priority.

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("A");
        queue.offer("C");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
