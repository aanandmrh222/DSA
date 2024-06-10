package AK_01_Array;

import java.util.Scanner;

public class AK_02_LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i=0; i<arr.length; i++) {
        System.out.print("Enter the "+ (i+1) +"th element: ");
        arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key which you find in this array: ");
        int key = sc.nextInt();

        for(int i=0; i<arr.length; i++) {
            if(key==arr[i]) {
                System.out.println("Key present at index "+ i);
            }
        }

//        boolean bool = false;
//        for(int i=0; i<arr.length; i++) {
//            if(key==arr[i]) {
//                bool = true;
//            }
//        }
//
//        if(bool) {
//            System.out.println("Key present in this array");
//        }
//        else {
//            System.out.println("Key not present in this array");
//        }

    }
}

