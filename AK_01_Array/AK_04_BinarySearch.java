package AK_01_Array;

public class AK_04_BinarySearch{
    // Time Complexity - O(log n)
    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == key) {  // key found
                return mid;
            }
            else if (arr[mid] > key) {  // left part
                end = mid - 1;
            }
            else {  // right part
                start = mid + 1;
            }
        }
        return -1;  // key not found
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("Key present at index " + binarySearch(arr,key));

    }
}
