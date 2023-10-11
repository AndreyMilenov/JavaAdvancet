package L04ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }

        }
        int mainDiagonal = findMainDiagonal(size, matrix);
        int secondaryDiagonal = findSecondaryDiagonal(size, matrix);
        System.out.println(Math.abs(mainDiagonal-secondaryDiagonal));

    }

    private static int findSecondaryDiagonal(int size, int[][] matrix) {
        int secondaryDiagonal = 0;

        for (int row = size - 1, col = 0; col < size && row >=0; row--, col++) {
             secondaryDiagonal += matrix[row][col];
        }
        return secondaryDiagonal;
    }

    private static int findMainDiagonal(int size, int[][] matrix) {
        int mainDiagonal = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    mainDiagonal += matrix[row][col];
                }

            }
        }
        return mainDiagonal;
    }
}
