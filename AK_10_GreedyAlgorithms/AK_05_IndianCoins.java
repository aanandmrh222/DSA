package AK_10_GreedyAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AK_05_IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 590;
        int noOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    noOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total (min) coins used = " + noOfCoins);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
}
