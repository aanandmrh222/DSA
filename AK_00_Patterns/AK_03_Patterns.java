package AK_00_Patterns;

public class AK_03_Patterns {
    public static void hollowRectangle(int rows, int columns) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=columns; j++) {
                if (i==1 || i==rows || j==1 || j==columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyrmid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedNumberPyrmid(int n) {
        for(int i=0; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n) {
        int a = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4,5);
        System.out.println("------------------------");
        invertedHalfPyrmid(4);
        System.out.println("------------------------");
        invertedNumberPyrmid(5);
        System.out.println("------------------------");
        floydTriangle(5);
    }
}
