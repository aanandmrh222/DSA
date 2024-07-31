package AK_03_Recursion;

public class AK_05_CheckSortedArray {
    // Time & Space Complexity - O(n)
    public static boolean isSorted(int[] arr, int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,9,4,5};
        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
    }
}
