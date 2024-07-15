package AK_09_Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AK_06_StackUsingTwoQueues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push - O(1)
        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            } else {
                q1.add(data);
            }
        }

        // pop - O(n)
        public static int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            // case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {  // case 2
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // peek - O(n)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            // case 1
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {  // case 2
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
