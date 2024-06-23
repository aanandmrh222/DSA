package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_02_ReverseArrayList {
    public static void reverseArray(ArrayList<Integer> arr) {
        // Complexity - O(n)
        for(int i=arr.size()-1; i>=0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Original arrayList");
        System.out.println(arrayList);
        System.out.println("Reversed arrayList");
        reverseArray(arrayList);
    }
}
