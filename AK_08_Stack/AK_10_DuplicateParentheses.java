package AK_08_Stack;
import java.util.Stack;

public class AK_10_DuplicateParentheses {

    public static boolean isDuplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();
        // complexity - O(n)
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;  // duplicate found
                }
                else {
                    s.pop();  // opening pair
                }

            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";  // true
        String str2 = "(a-b)";  // false

        System.out.println(isDuplicateParentheses(str1));
        System.out.println(isDuplicateParentheses(str2));
    }
}
