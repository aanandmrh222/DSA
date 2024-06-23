package AK_06_ArrayList;

import java.util.ArrayList;

public class AK_06_ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        list2.add(9);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
