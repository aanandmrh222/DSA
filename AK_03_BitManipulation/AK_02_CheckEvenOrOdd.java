package AK_03_BitManipulation;

public class AK_02_CheckEvenOrOdd {
    public static void checkEvenOrOdd(int num) {
        int bitMask = 1;
        if((num & bitMask) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
    public static void main(String[] args) {
        checkEvenOrOdd(3);
        checkEvenOrOdd(11);
        checkEvenOrOdd(14);
        checkEvenOrOdd(28);
    }
}
