package AK_03_Recursion;

public class AK_08_CheckPalindrome {
    public static boolean palindromeChecker(String str) {
        int n = str.length();
        if (n <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(n - 1)) {
            return false;
        }
        boolean palindrome = palindromeChecker(str.substring(1, n - 1));
        return palindrome;
    }


    public static void main(String[] args) {
        String str = "ABCDCBA";
        String str1 = "ABCDCBMA";
        System.out.println(palindromeChecker(str));
        System.out.println(palindromeChecker(str1));
    }
}
