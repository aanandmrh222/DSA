package AK_07_LinkedList;
public class AK_07_RemovingCycleInLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Slow-Fast Approach
    public static boolean isCycle() {   // Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while (fast !=null && fast.next != null) {
            slow = slow.next;    // +1
            fast = fast.next.next;   // +2

            if(slow == fast) {     // cycle exists
                return true;
            }
        }
        return false;    // cycle doesn't exists
    }

    public static void removeCycle() {
        // detecting point
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                cycle = true;
                break;
            }
        }
        if(cycle==false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;    // last node store
        while(slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }


    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        // 1 -> 2 -> 3 -> 2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}