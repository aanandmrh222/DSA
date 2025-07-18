package AK_14_Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AK_01_PriorityQueuesInJCF {
    public static void main(String[] args) {
        // int -> less, priority -> more
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);  // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());   // O(1)
            pq.remove();        // O(log n)
        }
    }
}
