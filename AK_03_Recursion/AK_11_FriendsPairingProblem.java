package AK_03_Recursion;

public class AK_11_FriendsPairingProblem {
    public static int friendsPairing(int n) {
        // base case
        if(n == 1 || n == 2) {
            return n;
        }

        // single choice
        int singleWay = friendsPairing(n - 1);
        // pair choice
        int pairWay = (n-1) * friendsPairing(n - 2);

        int totalWays = singleWay + pairWay;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
