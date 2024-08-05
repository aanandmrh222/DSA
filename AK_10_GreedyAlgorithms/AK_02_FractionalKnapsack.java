package AK_10_GreedyAlgorithms;
import java.util.Arrays;
import java.util.Comparator;

public class AK_02_FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int bagCapacity = 50;

        double[][] ratio = new double[value.length][2];
        // 0th col => idx; ist col => ratio

        for(int i=0; i< value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        // ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = bagCapacity;
        int finalValue = 0;
        for(int i= ratio.length-1; i>=0; i--) {
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]) {  // include full item
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value = " + finalValue);
    }
}
