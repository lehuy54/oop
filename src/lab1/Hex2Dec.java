package lab1;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String inStr = sc.nextLine();
        System.out.println(convert(inStr));
    }

    public static int toDigit(char ch) {
        return Character.digit(ch, 16);
    }

    public static boolean isValidInStr(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (toDigit(inStr.charAt(i)) != -1) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static int convert(String inStr) {
        if (!isValidInStr(inStr)) {
            return -1;
        }
        int decValue = 0;
        for (int i = 0; i < inStr.length(); i++) {
            decValue = decValue * 16 + toDigit(inStr.charAt(i));
        }
        return decValue;
    }

}

