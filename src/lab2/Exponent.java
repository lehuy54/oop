package lab2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponent;

        System.out.print("Enter the base: ");
        base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = sc.nextInt();
        System.out.print(base + " raises to the power of " + exponent + " is: " + exponent(base,exponent));
    }

    public static int exponent(int base, int exponent) {
        int product = 1;
        for (int i = 1; i <= exponent; i++) {
            product *= base;
        }
        return product;
    }
}
