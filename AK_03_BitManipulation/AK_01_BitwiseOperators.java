package AK_03_BitManipulation;

public class AK_01_BitwiseOperators {
    public static void main(String[] args) {
        // AND -> &, OR -> |,  XOR -> ^, One's Complement(NOT) -> ~
        // Left Shift -> <<, Right Shift -> >>
        // LSB -> Least Significant Bit   ex->  5 -> 00000101
        // MSB -> Most Significant Bit             MSB      LSB
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);    // ~5 -> 11111010 -> -6
        System.out.println(5 << 2);
        System.out.println(6 >> 1);
    }
}
