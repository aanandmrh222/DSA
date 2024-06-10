package AK_01_Array;

public class AK_05_ReverseArray {
    public static void reverseArray(int[] array) {
        int i = 0;
        int last = array.length - 1;
        while(i < array.length/2) {
            int temp = array[i];
            array[i] = array[last - i];
            array[last - i] = temp;
            i++;
        }
    }
    public static void printArray(int arr[]) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,85,4,5,6};
        System.out.print("Original array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed array: ");
        printArray(arr);

    }
}
