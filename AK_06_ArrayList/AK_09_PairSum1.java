package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_09_PairSum1 {
    // Brute force - O(n^2)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if((list.get(i) + list.get(j)) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer approach - O(n)
    public static boolean pairSumm1(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while(lp != rp) {
            // case 1
            if((list.get(lp)+list.get(rp)) == target) {
                return true;
            }
            // case 2
            else if ((list.get(lp)+list.get(rp)) < target) {
                lp++;
            }
            // case 3
            else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 1 2 3 4 5 6
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        int target = 5;
        int target1 = 50;
        System.out.println(pairSum1(arrayList,target));
        System.out.println(pairSum1(arrayList,target1));

        int tar = 5;
        int tar1 = 50;
        System.out.println(pairSumm1(arrayList,tar));
        System.out.println(pairSumm1(arrayList,tar1));

    }
}
