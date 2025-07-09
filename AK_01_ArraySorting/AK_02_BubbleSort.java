package AK_01_ArraySorting;

public class AK_02_BubbleSort {
    // Time complexity - O(n^2)
    public static void bubbleSort(int[] arr) {
        for(int i=0; i< arr.length-1; i++) {
            for(int j=0; j< arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {   // Ascending order
//                if(arr[j] < arr[j+1]) {   // Descending order
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        bubbleSort(arr);
        AK_00_PrintArray.printArray(arr);
    }
}
