package AK_01_Array;

public class AK_07_PrintSubArrays {
    // Time Complexity - O(n^3)
    public static void printSubArrays(int[] arr) {
        int totalSubArray = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                System.out.print("[");
                for(int k=i; k<=j; k++) {  // print
                    System.out.print(arr[k] +" ");  // sub array
                }
                totalSubArray++;
                System.out.print("]");
            }
            System.out.println();
        }
        System.out.println("Total sub array are " + totalSubArray);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArrays(arr);
    }
}
