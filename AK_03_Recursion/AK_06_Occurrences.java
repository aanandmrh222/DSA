package AK_03_Recursion;

public class AK_06_Occurrences {
    public static int firstOccurrence(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }

    public static int lastOccurrence(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurrence(arr, 5, 0));
        System.out.println(firstOccurrence(arr, 3, 0));
        System.out.println(firstOccurrence(arr, 13, 0));

        System.out.println(lastOccurrence(arr, 5, 0));
        System.out.println(lastOccurrence(arr, 3, 0));
        System.out.println(lastOccurrence(arr, 13, 0));
    }
}
