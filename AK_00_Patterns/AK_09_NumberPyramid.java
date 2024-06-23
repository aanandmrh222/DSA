package AK_00_Patterns;

public class AK_09_NumberPyramid {
    public static void numberPyramid(int n) {
        int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(count+ " ");
            }
            count++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        numberPyramid(5);
    }
}
