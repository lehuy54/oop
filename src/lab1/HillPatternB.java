package lab1;

import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int row = 1; row <= rows; row++) {
            int cols = 2*rows - 1;
            for (int col = 1; col <= cols; col++) {
                if ( (row + col <= cols + 1) && (row <= col) ) {
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
