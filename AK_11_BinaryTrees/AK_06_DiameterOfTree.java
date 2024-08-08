package AK_11_BinaryTrees;

public class AK_06_DiameterOfTree {
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

    static int heightOfTree(Node root) {
        if(root == null) return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }
    // Approach 1
    // Time complexity - O(n^2)
    static int diameterOfTree(Node root) {
        if(root ==null) return 0;
        int leftDiam = diameterOfTree(root.left);
        int rightDiam = diameterOfTree(root.right);

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int selfDiam = leftHeight + rightHeight + 1;

        int diameter = Math.max(selfDiam, Math.max(leftDiam, rightDiam));
        return diameter;
    }

    // Approach 2
    static class Info {
        int diameter;
        int height;
        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    // Time complexity - O(n)
    public static Info diameterTree(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterTree(root.left);
        Info rightInfo = diameterTree(root.right);

        int dia = Math.max(leftInfo.diameter, rightInfo.diameter);
        int diam = Math.max(dia, leftInfo.height + rightInfo.height + 1);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterOfTree(root));
        System.out.println(diameterTree(root).diameter);
        System.out.println(diameterTree(root).height);
    }
}
