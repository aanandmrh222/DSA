package AK_03_BitManipulation;

public class AK_04_CheckPowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        return (num&(num-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
    }
}
