package AK_01_Array;

public class AK_03_MinMax {
    // Time Complexity - O(n)
    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;   // +infinity
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // Time Complexity - O(n)
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;  // -infinity
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,3,5};

        System.out.println("Min element is: " + minElement(arr));
        System.out.println("Max element is: " + maxElement(arr));
    }
}
