package AK_01_ArraySorting;

public class AK_01_SelectionSort {
    // Time complexity - O(n)
    public static void selectionSort(int[] arr) {
        for(int i=0; i< arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j< arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        selectionSort(arr);
        AK_00_PrintArray.printArray(arr);
    }
}
