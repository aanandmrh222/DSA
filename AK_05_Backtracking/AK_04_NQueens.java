package AK_05_Backtracking;

public class AK_04_NQueens {
    public static void printBoard(char[][] board) {
        System.out.println("---------- Chess Board ----------");
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Time complexity - O(n!)
//    public static void nQueens(char[][] board, int row) {
//        // base case
//        if(row == board.length) {
////            printBoard(board);
//            count++;
//            return;
//        }
//        // column loop
//        for(int j=0; j<board.length; j++) {
//            if(isSafe(board, row, j)) {
//                board[row][j] = 'Q';
//                nQueens(board, row+1);  // function call
//                board[row][j] = 'x';    // backtracking step
//            }
//        }
//    }

    public static boolean nQueens(char[][] board, int row) {
        // base case
        if(row == board.length) {
//            printBoard(board);
            count++;
            return true;  // change 1
        }
        // column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) {
                    return true; // change 2
                }
                board[row][j] = 'x';    // backtracking step
            }
        }
        return false;  // change 3
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        // initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }

        // 1st type questions -> print all possible solution
//        nQueens(board, 0);

        // 2nd type question -> count all possible solution
//        System.out.println("Total ways to solve n queens is: " + count);

        // 3rd type questions -> check solution exists or not
        if(nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
