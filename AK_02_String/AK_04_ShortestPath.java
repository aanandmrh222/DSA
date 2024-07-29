package AK_02_String;

public class AK_04_ShortestPath {
    // Time complexity - O(n)
    public static double shortestPath(String path) {
        int x=0, y=0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if(dir == 'S') {
                y--;
            }
            // North
            else if(dir == 'N') {
                y++;
            }
            // West
            else if(dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        double X2 = x * x;
        double Y2 = y * y;
        return Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + shortestPath(path));
    }
}
