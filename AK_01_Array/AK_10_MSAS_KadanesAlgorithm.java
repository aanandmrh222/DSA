package AK_01_Array;

public class AK_10_MSAS_KadanesAlgorithm {
    // Time Complexity - O(n)
    public static void maxSubArraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(arr);
    }
}
