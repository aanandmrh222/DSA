package AK_09_Queue;
import java.util.Deque;
import java.util.LinkedList;

public class AK_10_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
