package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_10_PairSum2 {
    // Complexity - O(n)
    public static boolean pairSum2(ArrayList<Integer> arrayList, int target) {
        int bp = -1;
        int n = arrayList.size();
        for(int i=0; i<n; i++) {
            if(arrayList.get(i) > arrayList.get(i+1)) {  // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1;  // smallest
        int rp = bp;   // largest

        while (lp!=rp) {
            // case 1
            if(arrayList.get(lp) + arrayList.get(rp) == target) {
                return true;
            }
            // case 2
            if(arrayList.get(lp) + arrayList.get(rp) < target) {
                lp = (lp+1) % n;
            }
            // case 3
            else {
                rp = (n+rp-1) % n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10 - Sorted and Rotated
        arrayList.add(11);
        arrayList.add(15);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        int target = 16;
        int target1 = 160;
        System.out.println(pairSum2(arrayList, target));
        System.out.println(pairSum2(arrayList, target1));
    }
}
