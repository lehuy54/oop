package lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        if (size != 0)
            System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(arrayToString(array));
    }
    public static String arrayToString(int[] array) {
        if (array == null)
            return "[]";
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i > 0)
                str = str + ", ";
            str = str + Integer.toString(array[i]);
        }
        str = str + "]";
        return str;
    }
}

