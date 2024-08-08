package AK_11_BinaryTrees;

public class AK_04_CountOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Time complexity - O(n)
    static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode+rightNode + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(countNodes(root));
    }
}
