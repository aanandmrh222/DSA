package AK_05_Backtracking;

public class AK_03_FindPermutations {
    // Time complexity - O(n * n!)
    public static void findPermutations(String str, String ans) {
        // base case
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = abde
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
