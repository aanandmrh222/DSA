package AK_03_BitManipulation;

public class AK_06_FastExponentiation {
    public static int fastExpo(int num, int pow) {
        int ans = 1;
        while(pow > 0) {
            if((pow & 1) != 0) {  // check LSB
                ans = ans * num;
            }
            num = num * num;
            pow = pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
        System.out.println(fastExpo(5, 3));
    }
}
