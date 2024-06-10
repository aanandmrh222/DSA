package AK_01_Array;

import java.util.Collections;
import java.util.Scanner;

public class AK_01_Array {

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void main(String[] args) {

//        int marks[] = new int[50];
//        int number[] = {1,2,3};
//        int morenumbers[] = {4,5,6};
//
//        String fruits[] = {"apple", "orange", "mango"};
//
//        System.out.println(number[1]);
//        System.out.println(morenumbers[2]);
//        System.out.println(fruits[2]);
//
//        for(int i : number) {
//            System.out.print(i+"  ");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the "+ (i+1) +"th element: ");
            arr[i] = sc.nextInt();
        }

//        for(int i: arr) {
//            System.out.print(i+ "  ");
//        }
        printArray(arr);


    }
}
