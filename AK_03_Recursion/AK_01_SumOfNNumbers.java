package AK_03_Recursion;

public class AK_01_SumOfNNumbers {
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        int temp = sum(n-1);
        return temp+n;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
