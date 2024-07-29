package AK_02_2D_Array;

public class AK_02_SpiralMatrix {
    // Time complexity - O(n)
    public static void printSpiralMatrix(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // top boundary
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // right boundary
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom boundary
            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) break;
                System.out.print(arr[endCol][j] + " ");
            }

            // left boundary
            for (int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) break;
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        printSpiralMatrix(arr);
    }
}
