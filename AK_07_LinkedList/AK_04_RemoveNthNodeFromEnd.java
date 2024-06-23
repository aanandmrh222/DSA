package AK_07_LinkedList;
public class AK_04_RemoveNthNodeFromEnd {
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
    public static int size;

    // Complexity - O(1) constant time
    public void addFirst(int data) {
        // Step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 -> newNode next = head
        newNode.next = head;   // link
        // Step 3 -> head = newNode
        head = newNode;
    }

    // Printing LinkedList || Complexity - O(n)
    public void print() {
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null ");
    }

    public void removeNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        if(n==size) {
            head = head.next;  // remove first
            return;
        }

        // size - n
        int i = 1;
        int iTofind = size-n;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }



    public static void main(String[] args) {
        AK_04_RemoveNthNodeFromEnd ll = new AK_04_RemoveNthNodeFromEnd();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.removeNthfromEnd(2);
        ll.print();

    }
}