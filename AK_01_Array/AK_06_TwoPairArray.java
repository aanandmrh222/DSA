package AK_01_Array;

public class AK_06_TwoPairArray {
    public static void pairPrint(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                System.out.print("("+array[i]+","+array[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pairPrint(arr);
    }
}
