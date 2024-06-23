//package AK_04_String;
//
//public class AK_04_ShortestPath {
//    public static double distance(String s) {
//        int x0 = 0;
//        int y0 = 0;
//        int x1 = 0;
//        int y1 = 0;
//        for(int i=0; i<s.length(); i++) {
//            if(s.charAt(i)=='N') {
//                y1++;
//            }
//            else if(s.charAt(i)=='S') {
//                y1--;
//            }
//            else if(s.charAt(i)=='W') {
//                x1--;
//            }
//            else {
//                x1++;
//            }
//        }
//        System.out.println(x1+ " " + y1);
//        double dist = Math.sqrt(Math.pow((x1-x0),2) + Math.pow((y1-y0),2));
//        return dist;
//    }
//    public static void main(String[] args) {
//        String s = "WNEENESENNN";
//        System.out.println(distance(s));
//    }
//}


package AK_02_String;

public class AK_04_ShortestPath {

    public static double distance(String path) {
        int startingX = 0;
        int startingY = 0;
        int currentX = 0;
        int currentY = 0;

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    currentY++;
                    break;
                case 'S':
                    currentY--;
                    break;
                case 'W':
                    currentX--;
                    break;
                case 'E':
                    currentX++;
                    break;
                // Handle invalid directions (optional)
                default:
                    System.out.println("Invalid direction: " + direction);
                    // You can throw an exception here if strict validation is needed
            }
        }

        // Calculate the shortest distance using the Pythagorean theorem
        double distance = Math.sqrt(Math.pow(currentX - startingX, 2) + Math.pow(currentY - startingY, 2));
        return distance;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest distance: " + distance(path));
        System.out.println("tonny"=="tonny");
        String s1 = "tonny";
        System.out.println(s1.equals("tonny"));
    }
}
