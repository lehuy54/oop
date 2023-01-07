package lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        char hexChar[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";
        while (dec > 0) {
            int dec2hex = dec % 16;
            hex = hexChar[dec2hex] + hex;
            dec = dec / 16;
        }

        System.out.print("The equivalent hexadecimal number is: " + hex);
    }
}
