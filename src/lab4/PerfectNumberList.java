package lab4;

import java.util.Scanner;

public class PerfectNumberList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int perfectnumber = 0;
        int notperfectanddeficient = 0;
        System.out.print("Enter the upper bound: ");
        int upperbound = sc.nextInt();

        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= upperbound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectnumber++;
            }
        }
        double perfectNumberPercent = ((double)perfectnumber/(double)upperbound)*100.0;
        System.out.printf("%n[%d %s (%.2f%s)]%n", perfectnumber, "perfect number found", perfectNumberPercent, "%");

        System.out.println("\nThese numbers are neither perfect nor deficient:");
        for (int i = 1; i <= upperbound; i++) {
            if (!(isPerfect(i) || isDeficient(i))) {
                System.out.print(i + " ");
                notperfectanddeficient++;
            }
        }
        double notPerfectNumberAndDeficientPercent = ((double)notperfectanddeficient/(double)upperbound)*100.0;
        System.out.printf("%n[%d %s (%.2f%s)]", notperfectanddeficient, "perfect number found", notPerfectNumberAndDeficientPercent, "%");
    }
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        if (aPosInt > 0) {
            for (int i = 1; i < aPosInt; i++) {
                if (aPosInt % i == 0) {
                    sum += i;
                }
            }
            if (sum == aPosInt) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        if (aPosInt > 0) {
            for (int i = 1; i < aPosInt; i++) {
                if (aPosInt % i == 0) {
                    sum += i;
                }
            }
            if (sum < aPosInt) {
                return true;
            }
        }
        return false;
    }
}
