package lab2;

import java.util.Scanner;

public class Print {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] array;

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s: ", "Enter the element");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("The element of array is: ");
        print(array);
    }

    public static void print(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else {
                    System.out.print("," + array);
                }
            }
            System.out.print("]");
        }
        else {
            System.out.print("[]");
        }
    }

    public static void print(double[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else {
                    System.out.print("," + array);
                }
            }
            System.out.print("]");
        }
        else {
            System.out.print("[]");
        }
    }

    public static void print(float[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else {
                    System.out.print("," + array);
                }
            }
            System.out.print("]");
        }
        else {
            System.out.print("[]");
        }
    }
}
