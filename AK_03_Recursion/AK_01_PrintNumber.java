package AK_03_Recursion;

public class AK_01_PrintNumber {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printDec(10);
        printInc(10);
    }
}
