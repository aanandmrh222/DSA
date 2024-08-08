package AK_11_BinaryTrees;

public class AK_05_SumOfNodes {
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
    static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodeSum = sumOfNodes(root.left);
        int rightNodeSum = sumOfNodes(root.right);
        int sum = leftNodeSum+rightNodeSum + root.data;
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(sumOfNodes(root));
    }
}
