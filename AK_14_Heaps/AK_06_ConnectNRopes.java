package AK_14_Heaps;

import java.util.PriorityQueue;

public class AK_06_ConnectNRopes {
    // min length => ropes add
    static int connectNRopes(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size()>1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1+min2;
            pq.add(min1+min2);
        }
        return cost;
    }

    public static void main(String[] args) {
//        int[] ropes = {2, 3, 3, 4, 6}; // ans 41
        int[] ropes = {4, 3, 2, 6};  // ans 29

        // ropes com 2+3 = 5     cost = 5+9+15 = 29
        // 5 + 4 = 9
        // 9 + 6 = 15

        System.out.println(connectNRopes(ropes));
    }
}
