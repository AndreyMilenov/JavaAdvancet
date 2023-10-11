package L04ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String tape = input[1];

        int counter = 1;
        int [][] matrix = new int[size][size];

        if (tape.equals("A")){
            fillMatrixPatternA(size, matrix,counter);
        }else {
            fillMatrixPatternB(size, counter, matrix);
        }





        printMatrix(matrix);
    }

    private static void fillMatrixPatternB(int size, int counter, int[][] matrix) {
        for (int col = 0; col < size; col++) {
            if (col%2==0){

                for (int row = 0; row < size; row++) {
                        matrix[row][col] = counter;
                        counter++;
                    }
            }else {
                for (int row = size -1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int size, int[][] matrix,int counter) {

        for (int col = 0; col < size; col++) {

            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
