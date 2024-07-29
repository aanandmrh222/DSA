package AK_02_2D_Array;
import java.util.Scanner;

public class AK_01_2DArray {
    public static boolean search(int[][] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == key) {
                    System.out.printf("Key is found at cell: (%d,%d)", i,j);
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };

//        int[][] arr = new int[4][3];
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<4; i++) {  // rows
//            for(int j=0; j<3; j++) {  // columns
//                arr[i][j] = input.nextInt();
//            }
//        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        search(arr, 8);
    }
}
