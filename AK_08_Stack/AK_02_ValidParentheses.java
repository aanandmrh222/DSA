package AK_08_Stack;
import java.util.*;

public class AK_02_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "(([{}])()[])";
        String str2 = "(([{}])))[])";
        String str3 = "";


        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));

    }
}

