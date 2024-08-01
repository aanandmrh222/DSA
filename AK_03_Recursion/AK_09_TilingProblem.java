package AK_03_Recursion;

public class AK_09_TilingProblem {
    public static int tilingProblem(int n) {  // 2 x n (floor size)
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int verticalChoice = tilingProblem(n-1);
        // horizontal choice
        int horizontalChoice = tilingProblem(n-2);

        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
