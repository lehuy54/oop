package lab2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        do {
            System.out.print("Enter a positive integer ( or −1 to end ): ");
            number = sc.nextInt();
            if (hasEight(number)) {
                sum += number;
            }
        } while (number != -1);
        sc.close();
        System.out.print("The magic sum is: " + sum);
    }
    public static boolean hasEight(int number) {
        String s = String.valueOf(number);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '8' && number >= 0)
                return true;
        }
        return false;
    }
}