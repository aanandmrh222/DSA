package AK_02_2D_Array;

public class AK_03_DiagonalSum {
    // Time complexity - O(n^2)
    public static int diagonalSum(int[][] arr) {
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                // primary diagonal
                if(i==j) {
                    sum1 += arr[i][j];
                }
                // secondary diagonal
                else if(i+j == arr.length-1) {
                    sum2 += arr[i][j];
                }
            }
        }
        return sum1+sum2;
    }

    // Time complexity - O(n)
    public static int diagonalSum1(int[][] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            // primary diagonal
            sum += arr[i][i];
            // secondary diagonal
            if(i != arr.length-1-i) {
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8},
                {9,10,11,12}, {13,14,15,16}};
        System.out.println(diagonalSum1(arr));

    }
}
