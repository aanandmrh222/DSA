package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_04_SwapTwoNumbers {
    public static void swapTwoNumbers(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(14);
        arrayList.add(1);
        arrayList.add(-45);
        arrayList.add(100);
        arrayList.add(54);
        System.out.println("Before Swapping\n"+arrayList);
        swapTwoNumbers(arrayList,1,4);
        System.out.println("After Swapping\n"+arrayList);

    }
}
