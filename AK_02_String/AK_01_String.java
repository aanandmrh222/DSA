package AK_02_String;
import java.util.Scanner;

public class AK_01_String {
    public static void printChar(String str) {
        for(int i=0; i<str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(a%2==0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Stings are IMMUTABLE

        char[] ch = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("abcd");

        System.out.println(ch);
        System.out.println(ch[1]);
        System.out.println(str1);
        System.out.println(str2);

        System.out.print("Please enter your name: ");
//        String name = sc.next();  // it takes only one word
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Length of the String: " + name.length());

        // concatenation
        String firstName = "Aanand";
        String lastName = " Kumar";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();

        String s = "123456789";
        printChar(s);

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        if(s1 == s3) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        if(s1.equals(s3)) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

    }
}
