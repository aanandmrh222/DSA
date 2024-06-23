package AK_06_ArrayList;
import java.util.ArrayList;

public class AK_08_ContainerWithMostWater {
    // brute force - O(n^2)
    public static int maxStoreWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-1;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }


    // 2 Pointer Approach - O(n)
    public static int maxWater(ArrayList<Integer> height){
        int maxWater = 0;
        int leftPointer = 0, rightPointer = height.size()-1;
        while(leftPointer<rightPointer) {
            // Calculate water area
            int ht = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Update pointer
            if(height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(7);

        System.out.println(maxStoreWater(arrayList));
        System.out.println(maxWater(arrayList));
    }
}
