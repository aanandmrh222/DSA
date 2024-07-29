package AK_01_Array;

public class AK_08_MaxSubArraySum {
    // Time Complexity - O(n^3)
    public static void maxSubArraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) { // print
                    // sub array sum
                    currSum += arr[k];
                }
                System.out.print(currSum + " ");
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.print("Max Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
