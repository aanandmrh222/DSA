package AK_07_LinkedList;

public class AK_03_LinkedList {
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

    // Complexity - O(1) constant time
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
        size++;
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

    public int removeFirst() {
        if(size==0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast() {
        if(size==0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;    // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search (Iterative)
    public int itrSearch(int key) {  // O(n)
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key) {  // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Search (Recursive)
    public int helper(Node head, int key) {   // O(n)
        if(head == null) {
            return -1;
        }
        if(head.data==key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        AK_03_LinkedList ll = new AK_03_LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,500);
        ll.print();
//        System.out.println("Size of linked list is: " + ll.size);

//        ll.removeFirst();
//        ll.print();
//        System.out.println("Size of linked list is: " + ll.size);
//        ll.removeLast();
//        ll.print();
//        System.out.println("Size of linked list is: " + ll.size);

//        System.out.println(ll.itrSearch(500));
//        System.out.println(ll.itrSearch(50));
//
//        System.out.println(ll.recSearch(500));
//        System.out.println(ll.recSearch(50));

        ll.reverse();
        ll.print();




    }
}