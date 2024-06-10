package AK_03_Recursion;

public class AK_03_FibonacciSeries {
    public static int fibonacci(int num) {
//        if(num<0) return;
//        System.out.print("0 ");
//        if(num==0) return;
//        System.out.print("1 ");
//
//        int first = 0, second = 1;
//
//        while((first+second)<=num) {
//            int third = first + second;
//            System.out.print(third+" ");
//            first = second;
//            second = third;
//        }
        if(num==0) {
            return 0;
        }
        if(num==1) {
            return 1;
        }
        int temp1 = fibonacci(num-1);
        int temp2 = fibonacci(num-2);
        return temp1+temp2;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
