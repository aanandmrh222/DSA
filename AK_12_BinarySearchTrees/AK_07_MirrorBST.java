package AK_12_BinarySearchTrees;

public class AK_07_MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    // Time complexity - O(n)
    static Node createMirrorBST(Node root) {
        if(root == null) return null;

        Node leftMirror = createMirrorBST(root.left);
        Node rightMirror = createMirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
                8                     8
               / \                   / \
              5  10       --->      10  5
             / \   \               /   / \
            3   6   11           11   6   3
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preOrder(root);
        System.out.println();
        root = createMirrorBST(root);
        preOrder(root);
    }
}
