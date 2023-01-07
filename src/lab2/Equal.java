package lab2;

import java.util.Scanner;

public class Equal {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] array1;
        int[] array2;

        System.out.print("Enter the size of array 1: ");
        int size1 = sc.nextInt();
        array1 = new int[size1];

        System.out.print("Enter the size of array 2: ");
        int size2 = sc.nextInt();
        array2 = new int[size2];

        System.out.print("Enter the element of array 1: ");
        for (int i = 0; i < array1.length; i++) {
                array1[i] = sc.nextInt();
        }

        System.out.print("Enter the element of array 2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        if (equals(array1,array2)) {
            System.out.print("2 arrays are the same");
        }
        else {
            System.out.print("2 arrays are not the same");
        }

        sc.close();
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }
}
