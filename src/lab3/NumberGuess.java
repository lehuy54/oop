package lab3;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int numberGuess;
        int n = 1;
        System.out.println("Key in your guess:");
        numberGuess = sc.nextInt();

            if (0 < numberGuess && numberGuess < 99) {
                while (numberGuess != SECRET_NUMBER) {
                    if (numberGuess > SECRET_NUMBER) {
                        System.out.println("Try lower");
                        numberGuess = sc.nextInt();
                    }
                    else if (numberGuess < SECRET_NUMBER) {
                     System.out.println("Try higher");
                        numberGuess = sc.nextInt();
                    }
                     n++;
                }
            }
            else {
                System.out.print("You input the wrong number");
            }

            if (numberGuess == SECRET_NUMBER) {
                System.out.print("You got it in " + n + " trials!");
            }
    }
}
