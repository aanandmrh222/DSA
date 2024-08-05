package AK_10_GreedyAlgorithms;
import java.util.Arrays;
import java.util.Comparator;

public class AK_04_MaxLengthChainPairs {
    public static void main(String[] args) {
        int[][] pairs = {
                {5,24}, {39, 60}, {5, 28},
                {27, 40}, {50, 90}
        };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];  // Last selected pair end or chain end

        for (int i=1; i<pairs.length; i++) {
            if(chainEnd < pairs[i][0]) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain = " + chainLength);
    }
}
