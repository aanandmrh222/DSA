package AK_00_Patterns;

public class AK_02_HalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Character Printing
        System.out.println("---------------");
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
