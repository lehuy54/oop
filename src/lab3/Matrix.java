package lab3;

import java.util.Scanner;

public class Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row1,col1;
        int row2,col2;
        int[][] matrix1, matrix2;
        double[][] dmatrix1, dmatrix2;

        System.out.print("Enter the size of row1: ");
        row1 = sc.nextInt();
        System.out.print("Enter the size of col1: ");
        col1 = sc.nextInt();
        matrix1 = new int[row1][col1];
        dmatrix1 = new double[row1][col1];

        System.out.print("Enter the size of row2: ");
        row2 = sc.nextInt();
        System.out.print("Enter the size of col2: ");
        col2 = sc.nextInt();
        matrix2 = new int[row2][col2];
        dmatrix2 = new double[row2][col2];

        System.out.print("Enter the element of matrix1: ");
        createRandomMatrix(row1,col1);
        System.out.print("Enter the element of matrix2: ");
        createRandomMatrix(row2,col2);
        if (haveSameDimension(dmatrix1,dmatrix2)) {
            System.out.println("sum of 2 matrix: ");
            print(add(dmatrix1, dmatrix2));
            System.out.println("substract of 2 matrix: ");
            print(subtract(dmatrix1, dmatrix2));
        }
        else if (haveSameDimensionMul(dmatrix1,dmatrix2)) {
            System.out.println("multiply of 2 matrix: ");
            print(multiply(dmatrix1, dmatrix2));
        }
        else {}
    }
/*
    public static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (!((matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean haveSameDimensionMul(int[][] matrix1, int[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (!(matrix1[0].length == matrix2.length)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        if (!(haveSameDimension(matrix1,matrix2))) {
            return null;
        }
        else {
            for (int row = 0; row < sum.length; row++) {
                for (int col = 0; col < sum[0].length; col++) {
                    sum[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        }
        return sum;
    }
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] substract = new int[matrix1.length][matrix1[0].length];
        if (!(haveSameDimension(matrix1,matrix2))) {
            return null;
        }
        else {
            for (int row = 0; row < substract.length; row++) {
                for (int col = 0; col < substract[0].length; col++) {
                    substract[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        }
        return substract;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mul = new int[matrix1.length][matrix2[0].length];
        if (!haveSameDimensionMul(matrix1,matrix2)) {
            return null;
        }
        else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < matrix2.length; k++) {
                        mul[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        return mul;
    }
 */
      public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextDouble();
            }
        }
        return matrix;
    }
     public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (!(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean haveSameDimensionMul(double[][] matrix1, double[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (!(matrix1[0].length == matrix2.length)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1,matrix2)) {
            return null;
        }
        else {
            for (int row = 0; row < sum.length; row++) {
                for (int col = 0; col < sum[0].length; col++) {
                    sum[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        }
        return sum;
    }


    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] substract = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < substract.length; row++) {
            for (int col = 0; col < substract[0].length; col++) {
                substract[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return substract;
    }


    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mul = new double[matrix1.length][matrix2[0].length];
        if (!haveSameDimensionMul(matrix1,matrix2)) {
            return null;
        }
        else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    mul[i][j] = 0.0;
                    for (int k = 0; k < matrix2.length; k++) {
                        mul[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        return mul;
    }

}
