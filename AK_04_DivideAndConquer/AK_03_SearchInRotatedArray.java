package AK_04_DivideAndConquer;

public class AK_03_SearchInRotatedArray {
    // Time Complexity - O(n log n)
    public static int search(int[] arr, int target, int start, int end) {
        // base case
        // target not found in th array
        if(start > end) {
            return -1;
        }

        // kam
        int mid = start + (end-start) / 2;

        // case found
        if(arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if(arr[start] <= arr[mid]) {
            // case a : left
            if(arr[start] <= target && target <= arr[mid]) {
                return search(arr,target, start, mid-1);
            } else {
                // case b : right
                return search(arr, target, mid+1, end);
            }
        }

        // mid on L2
        else {
            // case c : right
            if(arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid+1, end);
            } else {
                // case d : left
                return search(arr, target, start, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
