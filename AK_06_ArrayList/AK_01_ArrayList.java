package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_01_ArrayList {
    public static void main(String[] args) {
        // JAVA Collection Framework
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();
        ArrayList<Boolean> arrayListBoolean = new ArrayList<>();

        // Operations:- add, get, remove, set , contains element
        // add - O(1)
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(0,3);  // O(n)
        System.out.println(arrayList);

        // get - O(1)
        int ele = arrayList.get(1);
        System.out.println(ele);

        // delete - O(n)
        arrayList.remove(2);
        System.out.println(arrayList);

        // set element at index - O(n)
        arrayList.set(2,100);
        System.out.println(arrayList);

        // Contains - O(n)
        System.out.println(arrayList.contains(45));
        System.out.println(arrayList.contains(100));

        for(int i : arrayList) {
            System.out.print(i + " ");
        }

        int size = arrayList.size();
        System.out.println("\nSize of arrayList is: " + size);

        for(int i=0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
