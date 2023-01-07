package lab4;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] array;

        System.out.print("Enter the length of array: ");
        n = sc.nextInt();
        array = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
                if (min != array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
