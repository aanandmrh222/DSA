package AK_08_Stack;
import java.util.Stack;
  
public class AK_08_NextGreaterElement {
    public static void main(String[] args) {
        // complexity (n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i= arr.length-1; i>=0; i--) {
            // 1. while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. if-else
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // 3. push in s
            s.push(i);
        }

        for(int i : nextGreater) {
            System.out.print(i + " ");
        }

        // next Greater Right
        // next Greater Left
        // next Smaller Right
        // next Smaller Left
    }
}
