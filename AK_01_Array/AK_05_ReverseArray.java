package AK_01_Array;

public class AK_05_ReverseArray {
    // Time Complexity - O(n), Space Complexity - O(1)
    public static void reverseArray(int[] array) {
        int first = 0, last = array.length - 1;
        while(first < last) {
            // swap
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.print("Original array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed array: ");
        printArray(arr);

    }
}
