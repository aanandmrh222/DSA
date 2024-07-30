package AK_03_BitManipulation;

public class AK_05_CountSetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) != 0) {  // check our LSB
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    }
}
