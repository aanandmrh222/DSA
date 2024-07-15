package AK_07_LinkedList;

public class AK_11_DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first
    public int removeFirst() {
        if(head==null) {
            System.out.println("Doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;    // line throw error when size of dll is 1
        size--;
        return val;
    }

    public static void main(String[] args) {
        AK_11_DoublyLL dll = new AK_11_DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.printf("Size of doubly linked list is %d", dll.size);

        System.out.println("\nFirst node remove " + dll.removeFirst());
        dll.print();
        System.out.printf("Size of doubly linked list is %d", dll.size);
    }
}
