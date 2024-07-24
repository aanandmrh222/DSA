package AK_09_Queue;
import java.util.LinkedList;
import java.util.Queue;

// Time and Space complexity - O(n)
public class AK_08_InterleaveTwoHalvesOfQueue {
    public static void interleaveTwoHalves(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++) {
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
        for(int i=1; i<=10; i++) {
            q.add(i);
        }

        interleaveTwoHalves(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}
