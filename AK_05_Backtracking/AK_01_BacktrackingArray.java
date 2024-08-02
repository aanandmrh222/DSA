package AK_05_Backtracking;
import AK_01_ArraySorting.AK_00_PrintArray;

public class AK_01_BacktrackingArray {
    // Time complexity - O(n)
    public static void changeArr(int[] arr, int i, int value) {
        // base case
        if(i == arr.length) {
            AK_00_PrintArray.printArray(arr);
            return;
        }
        // recursion
        arr[i] = value;
        changeArr(arr, i+1, value+1);  // fn call step

        arr[i] = arr[i] - 2;  // backtracking step
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        AK_00_PrintArray.printArray(arr);
    }
}
