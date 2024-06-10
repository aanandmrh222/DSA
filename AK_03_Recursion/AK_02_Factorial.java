package AK_03_Recursion;

public class AK_02_Factorial {
    public static long fact(int n) {
        if(n==0) {
            return 1;
        }
        long temp = fact(n-1);
        return temp*n;
    }
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
