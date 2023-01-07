package lab4;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = 0;
        System.out.print("Please enter the upper bound: ");
        int upperbound = sc.nextInt();

        for (int i = 1; i <= upperbound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                prime++;
            }
        }
        double primepercent = ((double)prime / (double)upperbound)*100.0;
        System.out.printf("[%d %s (%.2f%%)]", prime, "primes found", primepercent);
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        else {
            for (int i = 2; i < aPosInt; i++) {
                if (aPosInt % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
