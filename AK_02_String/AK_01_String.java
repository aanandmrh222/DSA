package AK_02_String;
import java.util.Scanner;

public class AK_01_String {
    public static boolean isPalindrome(String str) {
        boolean palindrome = false;
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if((str.charAt(i) == str.charAt(len-1))) {
                palindrome = true;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char ch[] = {'a', 'b', 'c', 'd'};
//        String str1 = "abcd";
//        String str2 = new String("abcd");
//
//        System.out.println(ch);
//        System.out.println(ch[1]);
//        System.out.println(str1);
//        System.out.println(str2);
//
//        System.out.print("Please enter your name: ");
////        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);
//        System.out.println("Length of the String: " +name.length());
//
//        String firstName = "Aanand";
//        String lastName = "Kumar";
//        String fullName = firstName + lastName;
//        System.out.println(fullName);
//
//        for(int i=0; i<fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }

        String s = "ABCBA";
        System.out.println(isPalindrome(s));

    }
}
