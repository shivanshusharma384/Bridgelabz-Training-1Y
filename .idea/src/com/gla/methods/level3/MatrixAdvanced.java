package com.gla.methods.level3;
import java.util.Scanner;
import java.util.Random;

public class MatrixAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createRandomMatrix(n, n);
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            System.out.println("\nDeterminant: " + determinant2x2(matrix));
            System.out.println("\nInverse:");
            displayMatrix(inverse2x2(matrix));
        } else if (n == 3) {
            System.out.println("\nDeterminant: " + determinant3x3(matrix));
            System.out.println("\nInverse:");
            displayMatrix(inverse3x3(matrix));
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(5) + 1;
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) return null;

        double[][] adj = new double[3][3];

        // Calculate cofactors and adjugate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = getMinor(matrix, i, j);
                adj[j][i] = ((i + j) % 2 == 0 ? 1 : -1) * determinant2x2(minor);
            }
        }

        // Divide by determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adj[i][j] /= det;
            }
        }
        return adj;
    }

    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int[][] minor = new int[2][2];
        int r = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }
        return minor;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}
