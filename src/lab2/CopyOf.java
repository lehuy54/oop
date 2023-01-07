package lab2;

import java.util.Scanner;

public class CopyOf {
    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] arrayCopy = new int[newLength];

        if (newLength > array.length) {
            for (int i = 0; i < array.length; i++) {
                arrayCopy[i] = array[i];
            }
            for (int i = array.length; i < newLength; i++) {
                arrayCopy[i] = 0;
            }
        } else if (array.length >= newLength) {
            for (int i = 0; i < array.length; i++) {
                arrayCopy[i] = array[i];
            }
        }

        return arrayCopy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size in array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        if (size != 0)
            System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int[] newArray = copyOf(array);

        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
