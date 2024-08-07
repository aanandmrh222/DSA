package AK_08_Stack;
import java.util.Stack;

public class AK_09_ValidParentheses {
    public static boolean isValidParentheses(String str) {
        Stack<Character> s = new Stack<>();
        // Complexity = O(n)
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }

            // closing
            else {
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek()=='(' && ch==')')
                 || (s.peek()=='{' && ch=='}')
                 || (s.peek()=='[' && ch==']') ) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "({})[]";
        String str1 = "(({)})[]";

        System.out.println(isValidParentheses(str));
        System.out.println(isValidParentheses(str1));

    }
}
