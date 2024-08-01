package AK_04_DivideAndConquer;

public class AK_01_MergeSort {
    // Time complexity - O(n log n)
    // Space complexity - O(n)
    public static void mergeSort(int[] arr, int start, int end) {
        // base case
        if(start >= end) {
            return;
        }
        // kam
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);   // left part
        mergeSort(arr, mid+1, end);   // right part
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        // left(0,3)=4, right(4,6)=3 -> 6-0+1=7
        int[] temp = new int[end - start + 1];
        int i = start;   // iterator for left part
        int j = mid+1;   // iterator for right part
        int k = 0;   // iterator for temp arr

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while(j <= end) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for(k=0, i=start; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, -2};
        mergeSort(arr, 0, arr.length-1);
        AK_00_PrintArray.printArray(arr);
    }
}
