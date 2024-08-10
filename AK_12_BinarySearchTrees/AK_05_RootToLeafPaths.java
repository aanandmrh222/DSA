package AK_12_BinarySearchTrees;
import java.util.ArrayList;

public class AK_05_RootToLeafPaths {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) return;

        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        printRootToLeaf(root, new ArrayList<>());
    }
}
