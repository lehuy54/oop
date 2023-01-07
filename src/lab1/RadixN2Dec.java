package lab1;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the input: ");
        String inStr = sc.nextLine();
        System.out.println(convertRadixN2Dec(inStr,radix));

    }

    public static boolean isValidRadixString (String inStr, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.digit(inStr.charAt(i), radix) != -1) { // Character.digit return -1 if cant convert
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static long  convertRadixN2Dec (String inStr, int radix) {
        if (!(isValidRadixString(inStr, radix))) {
            return -1;
        }
        long decValue = 0;
        for (int i = 0; i < inStr.length(); i++) {
            decValue = decValue * radix + Character.digit(inStr.charAt(i), radix);
        }
        return decValue;
    }
}