package AK_06_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class AK_05_SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(14);
        arrayList.add(1);
        arrayList.add(-45);
        arrayList.add(100);
        arrayList.add(54);
        System.out.println("Before Sorting: "+arrayList);
        Collections.sort(arrayList);
        System.out.println("After Sorting: "+arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Reverse Order: "+arrayList);

    }
}
