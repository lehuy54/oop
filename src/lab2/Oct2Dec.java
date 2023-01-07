package lab2;
import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String oct = sc.nextLine();
        System.out.printf("%s\"%s\"%s: %d","The equivalent decimal number ", oct, " is", convertOctalToDecimal(oct));
    }

    public static int toDigit(char ch) {
        return Character.digit(ch, 8);
    }

    public static boolean isValidOctalString (String lowerCaseStr) {
        char ch;
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            ch = lowerCaseStr.charAt(i);
            if (!(ch >= '0' && ch <= '7')) {
                return false;
            }
        }
        return true;
        }

    public static int convertOctalToDecimal (String octString) {
        if (!isValidOctalString(octString)) {
            return -1;
        }

        int decValue = 0;
        for (int i = 0; i < octString.length(); i++) {
            decValue = decValue * 8 + toDigit(octString.charAt(i));
        }
        return decValue;
    }
}
