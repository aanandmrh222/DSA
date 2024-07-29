package AK_01_Array;

public class AK_15_NextGreatestLetter {
    // Time complexity - O(log n)
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(arr,target));
    }
}
