package AK_01_Array;

public class AK_07_PrintingSubArray {
    public static void printingSubArray(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i; j<arr.length; j++) {
                System.out.print("[");
                for(int k=i; k<=j; k++) {
                    System.out.print(" "+ arr[k] +" ");
                }
                System.out.print("]    ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printingSubArray(arr);
    }
}
