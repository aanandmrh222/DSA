package AK_01_Array;

public class AK_08_MaxSumInSubArray {
    public static void printingSubArray(int[] arr) {
        int sum;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];
                System.out.print("[");
                System.out.print(sum);
                if(max<sum) {
                    max = sum;
                }
                System.out.print("]    ");
            }
            System.out.println();
        }
        System.out.print("Max Sum of the sub array is: "+max);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printingSubArray(arr);
    }
}
