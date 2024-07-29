package AK_01_Array;

public class AK_13_EvenDigits {
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noOfDigits = 0;
        while(num>0) {
            noOfDigits++;
            num /= 10;
        }
        return (noOfDigits % 2 == 0);
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
