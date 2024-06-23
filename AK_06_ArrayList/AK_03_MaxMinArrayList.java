package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_03_MaxMinArrayList {
    public static int max(ArrayList<Integer> arr) {
        // Complexity - O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++) {
//            if(arr.get(i)>max) {
//                max = arr.get(i);
//            }
            max = Math.max(max, arr.get(i));
        }
        return max;
    }
    public static int min(ArrayList<Integer> arr) {
        // Complexity - O(n)
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i)<min) {
                min = arr.get(i);
            }
//            min = Math.min(min, arr.get(i));
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(14);
        arrayList.add(1);
        arrayList.add(-45);
        arrayList.add(100);
        arrayList.add(54);
        System.out.println(arrayList);

        System.out.println("Maximum element of arraylist is: "+max(arrayList));
        System.out.println("Minimum element of arraylist is: "+min(arrayList));

    }
}
