package AK_01_Array;

public class AK_02_LinearSearch {
    // Time Complexity - O(n)
    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchBoolean(int[] arr, int key) {
        for (int j : arr) {
            if (j == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Key is not present");
        } else {
            System.out.println("Key is present at index " + index);
        }

        System.out.println(linearSearchBoolean(arr,10));
        System.out.println(linearSearchBoolean(arr,11));

    }
}

