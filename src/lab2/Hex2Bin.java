package lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal: ");
        String str = sc.nextLine();
        sc.close();

        String hex = "0123456789abcdef";
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111", "1000", "1001",
                "1010", "1011", "1100", "1101", "1110", "1111"};
        System.out.printf("%s \"%s\" %s:","The equivalent binary for hexadecimal", str, "is");

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < hex.length(); j++) {
                if (str.charAt(i) == hex.charAt(j)) {
                    System.out.print(" " + HEX_BITS[j]);
                }
            }
        }
    }
}
