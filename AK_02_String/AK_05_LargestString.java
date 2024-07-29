package AK_02_String;

public class AK_05_LargestString {
    // Time complexity - O(x * n)
    public static String largestString(String[] str) {
        String largest = str[0];
        for(int i=1; i<str.length; i++) {
            if(largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        System.out.println(largestString(fruits));
    }
}
