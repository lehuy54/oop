package lab1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr;
        int inStrlen;

        System.out.print("Enter a String: ");
        inStr = sc.nextLine();
        inStrlen = inStr.length();

        System.out.print("The reverse of the String " + inStr + " is ");
        for ( int charIdx = inStrlen-1; charIdx >=0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }

    }
}
