package AK_01_ArraySorting;

public class AK_04_CountingSort {
    // Time complexity - O(n+range)
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // new array to store count
        int[] count = new int[largest+1];  // +1 because we consider 0 also
        for (int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        AK_00_PrintArray.printArray(arr);
    }
}
