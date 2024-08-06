package AK_10_GreedyAlgorithms;
import java.util.Arrays;
import java.util.Collections;

public class AK_07_ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] costVer = {2, 1, 3, 1, 4};  // m-1
        Integer[] costHor = {4, 1, 2};  // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        //pointer to track both array
        int h = 0, v = 0;
        //integer to track the no. of pieces
        int hp = 1, vp = 1;

        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){  // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else{ // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        //for remaining elements in horizontal array
        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        //for remaining element in vertical array
        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Min cost of cuts = " + cost);
    }
}

