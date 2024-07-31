package AK_03_Recursion;

public class AK_03_SumOfNNumbers {
    // Time & Space Complexity - O(n)
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        int temp = sum(n-1);
        return n + temp;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
