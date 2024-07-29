package AK_02_2D_Array;

public class AK_04_SearchInSortedMatrix {
    // Time complexity - O(n^2)
    public static boolean searchInMatrix(int[][] arr, int key) {
        for(int[] i : arr) {
            for(int j : i) {
                if(j==key) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time complexity - O(n + m)
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.printf("Key found at (%d,%d)", row,col);
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40}, {15,25,35,45},
                {27,29,37,48}, {32,33,39,50}};
        int key = 33;
//        System.out.println(searchInMatrix(arr,key));
        staircaseSearch(arr, key);
    }
}
