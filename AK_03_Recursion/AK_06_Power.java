package AK_03_Recursion;

public class AK_06_Power {
    public static long pow(int a, int n) {
        if(n==0) {
            return 1;
        }
        long temp = pow(a,n-1);
        return a * temp;
    }

//    public static long pow1(int a, int n) {
//        if(n%2==0) {
//            return a * pow1(a, n/2);
//        }
//        return a * pow1(a, n/2);
//    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow(5,2));
        System.out.println(pow(5,3));

//        System.out.println(pow1(2,3));


    }
}
