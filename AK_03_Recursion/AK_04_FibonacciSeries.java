package AK_03_Recursion;

public class AK_04_FibonacciSeries {
    // Time & Space complexity - O(n)
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int temp1 = fibonacci(n - 1);
        int temp2 = fibonacci(n - 2);
        return temp1 + temp2;
    }

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55
        System.out.println(fibonacci(10));
    }
}
