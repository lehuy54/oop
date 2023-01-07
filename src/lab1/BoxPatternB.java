package lab1;

import java.util.Scanner;

public class BoxPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || col == row) {
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
