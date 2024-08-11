package AK_12_BinarySearchTrees;
import java.util.ArrayList;

public class AK_09_BSTtoBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void getInOrder(Node root, ArrayList<Integer> inOrder) {
        if(root == null) return;

        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }

    static Node createBST(ArrayList<Integer> inOrder, int start, int end) {
        if(start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, start, mid-1);
        root.right = createBST(inOrder, mid+1, end);
        return root;
    }

    // Time complexity - O(n)
    static Node balancedBST(Node root) {
        // inorder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        // sorted inorder -> balanced BSt
        root = createBST(inOrder, 0, inOrder.size()-1);
        return root;
    }


    public static void main(String[] args) {
        /*
              8                     8
             / \                  /   \
            6  10                5    11
           /     \    ---->     / \   / \
          5      11            3   6 10 12
         /         \
        3          12
         */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        preOrder(root);
        System.out.println();
        root = balancedBST(root);
        preOrder(root);
    }
}
