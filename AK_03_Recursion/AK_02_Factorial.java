package AK_03_Recursion;

public class AK_02_Factorial {
    // Time and Space complexity - O(n)
    public static long fact(int n) {
        if(n==0) {
            return 1;
        }
        long temp = fact(n-1);
        return n * temp;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
