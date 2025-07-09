/*
When given numbers from range 1,N => use cyclic sort
ex- 3 5 2 1 4 => 1 2 3 4 5
                 0 1 2 3 4  corrIdx = value - 1
 */

package AK_01_ArraySorting;

import java.util.Arrays;

public class AK_05_CyclicSort {
    // Time complexity - O(n)
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int corrIdx = arr[i] - 1;
            if(arr[i] != arr[corrIdx]) {
                int temp = arr[i];
                arr[i] = arr[corrIdx];
                arr[corrIdx] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
