package AK_01_Array;
import java.util.Scanner;

public class AK_03_MinMax {
    public static int minElement(int[] arr) {
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the "+ (i+1) +"th element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Min element is: "+ minElement(arr));
        System.out.println("Max element is: "+ maxElement(arr));
    }
}
