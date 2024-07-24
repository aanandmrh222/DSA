package AK_01_Array;

public class AK_06_PairsInArray {
    // Time Complexity - O(n^2)
    public static void printPairs(int[] array) {
        int totalPairs = 0;
        for(int i=0; i<array.length; i++) {
            int curr = array[i];  // 2,4,6,8,10
            for(int j=i+1; j<array.length; j++) {
                System.out.print("(" + curr + "," + array[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are " + totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printPairs(arr);
    }
}
