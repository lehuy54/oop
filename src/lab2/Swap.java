package lab2;

import java.util.Scanner;

public class Swap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int temp;
            for (int i = 0; i < array1.length; i++) {
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        if (size1 != 0)
            System.out.print("Enter element of array 1: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        if (size2 != 0)
            System.out.print("Enter element of array 2: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();
        if (swap(array1, array2)) {
            System.out.print("SWAP");
        } else {
            System.out.print("NOT SWAP");
        }
    }
}
