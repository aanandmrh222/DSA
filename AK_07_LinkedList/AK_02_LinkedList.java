package AK_07_LinkedList;

public class AK_02_LinkedList {
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

    // Complexity - O(1) constant time
    public void addFirst(int data) {
        // Step 1 = create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 -> newNode next = head
        newNode.next = head;   // link

        // Step 3 -> head = newNode
        head = newNode;
    }

    // Complexity - O(1) constant time
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    // Complexity - O(n)
    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public static void main(String[] args) {
        AK_02_LinkedList ll = new AK_02_LinkedList();

        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        ll.addMiddle(2,500);
        ll.print();

    }
}
