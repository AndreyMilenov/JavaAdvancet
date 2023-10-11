package L03MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;


public class P05MaximumSumOfSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimension = Arrays.stream(scanner.nextLine().split(", "))
                 .mapToInt(Integer::parseInt).toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] =Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int[][] maxSumMatrix = new int[2][2];

        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < matrix.length-1; r++) {

            for (int c = 0; c < matrix[r].length-1; c++) {

                int sum = matrix[r][c] + matrix[r][c+1] +
                        matrix [r+1][c] + matrix[r+1][c+1];

                if (sum > maxSum){
                    maxSum = sum;
                    maxSumMatrix[0][0] = matrix[r][c];
                    maxSumMatrix[0][1] = matrix[r][c+1];
                    maxSumMatrix[1][0] = matrix [r+1][c];
                    maxSumMatrix[1][1] = matrix[r+1][c+1];
                }

            }
        }

        for (int[] sumMatrix : maxSumMatrix) {
            for (int i : sumMatrix){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}
