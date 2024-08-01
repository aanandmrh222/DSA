package AK_04_DivideAndConquer;

public class AK_02_QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        // base case
        if(start >= end) {
            return;
        }
        // last element
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex-1);  // left part
        quickSort(arr, pivotIndex+1, end);   // right part
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1; // to make place for elements smaller than pivot

        for(int j=start; j<end; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];  // pivot = arr[i] nhi likhna hai
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5, -2};
        quickSort(arr, 0, arr.length-1);
        AK_00_PrintArray.printArray(arr);
    }
}
