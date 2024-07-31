package AK_03_Recursion;

public class AK_07_Power {
    // Time complexity - O(n)
    public static int power(int num, int p) {
        if(p == 0) {
            return 1;
        }
        int temp = power(num,p-1);
        return num * temp;
    }

    // Time complexity - O(log n)
    public static int optimizedPower(int num, int p) {
        if(p == 0) {
            return 1;
        }
        int halfPower = optimizedPower(num, p/2);
        int halfPowerSq = halfPower * halfPower;

        // power is odd
        if(p % 2 != 0) {
            halfPowerSq = num * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(power(5,2));
        System.out.println(power(5,3));

        System.out.println(optimizedPower(2,3));
        System.out.println(optimizedPower(5,2));
    }
}
