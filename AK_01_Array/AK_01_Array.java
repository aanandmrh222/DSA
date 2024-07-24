package AK_01_Array;
import java.util.Scanner;

public class AK_01_Array {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
    }

    public static void updateMarks(int[] arr, int nonChangeable) {
        nonChangeable = 10;
        for(int i=0; i<arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void main(String[] args) {

        int[] marks = new int[50];
        int[] number = {1,2,3,4,5,6};
        String[] fruits = {"apple", "orange", "mango"};

        System.out.println(marks[0]);
        System.out.println(number[1]);
        System.out.printf("Size of array number is %d\n", number.length);
        System.out.println(fruits[2]);

        for(int i : number) {
            System.out.print(i+"  ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int m = input.nextInt();
        int[] arr = new int[m];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the "+ (i+1) +"th element: ");
            arr[i] = input.nextInt();
        }
        printArray(arr);

        // arrays are passes by reference
        int[] marks1 = {97,98,99};
        int nonChangeable = 5;
        updateMarks(marks1, nonChangeable);
        printArray(marks1);
        System.out.println(nonChangeable);

    }
}
