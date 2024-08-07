/*
    DFS - Depth First Search || ex - 1,2,3
    BFS - Breadth First Search || ex - 4
 */

package AK_11_BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class AK_02_TreeTraversals {
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

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // 1. Preorder Traversal - O(n) | DFS
        public static void preOrder(Node root) {
            // base case
            if(root == null) {
//                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // 2. Inorder Traversal - O(n) | DFS
        public static void inOrder(Node root) {
            // base case
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // 3. Postorder Traversal - O(n) | DFS
        public static void postOrder(Node root) {
            // base case
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // 4. LevelOrder Traversal - O(n) | BFS
        public static void levelOrder(Node root) {
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("PreOrder Traversal: ");
        BinaryTree.preOrder(root);
        System.out.println("\nInOrder Traversal: ");
        BinaryTree.inOrder(root);
        System.out.println("\nPostOrder Traversal: ");
        BinaryTree.postOrder(root);
        System.out.println("\nLevelOrder Traversal:");
        BinaryTree.levelOrder(root);

    }
}