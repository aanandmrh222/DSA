package AK_00_Patterns;

public class AK_01_StarPrint {
    public static void main(String[] args) {
        int n = 5;
        // Star Printing
        for(int line=1; line<=n; line++) {
            for(int j=0; j<line; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Star Printing
        System.out.println("---------------");
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
