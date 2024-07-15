package AK_07_LinkedList;
import java.util.LinkedList;
public class AK_08_LinkedListUsingJCF {
    public static void main(String[] args) {
        // create - objects int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addFirst(0);
        // 0 -> 1 -> 2 -> 3

        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
