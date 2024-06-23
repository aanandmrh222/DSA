package AK_07_LinkedList;

public class AK_01_LinkedList {
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


    public static void main(String[] args) {

        AK_01_LinkedList ll = new AK_01_LinkedList();

        ll.head = new Node(1);
        ll.head.next = new Node(2);



    }
}
