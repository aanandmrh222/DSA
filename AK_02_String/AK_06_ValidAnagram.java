package AK_02_String;

public class AK_06_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(char ch : s.toCharArray()) {
            count [ch-'a']++;
        }

        for(char ch : t.toCharArray()) {
            count [ch-'a']--;
        }

        for(int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
