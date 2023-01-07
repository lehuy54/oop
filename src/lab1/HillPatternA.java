package lab1;

import java.util.Scanner;

public class HillPatternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int row = 1; row <= rows; row++) {
            int cols = 2*rows - 1;
            for (int col = 1; col <= cols; col++) {
                if ((row + col > rows) && (row >= col - rows + 1)) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
