package L04ExerciseMultidimensionalArrays;


import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dimensions = scanner.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);
        int counter = 1;
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = counter;
                counter++;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int ro = Integer.parseInt(command.split("\\s+")[0]);
            int co = Integer.parseInt(command.split("\\s+")[1]);
            int radios = Integer.parseInt(command.split("\\s+")[2]);

            for (int row = ro - radios; row < ro + radios; row++) {
                if (row < matrix.length && row >= 0) {

                        matrix[row][co] = 101;

                }
            }
            for (int col = co - radios; col < co + radios; col++) {
                if (col < matrix[ro].length && col >= 0) {

                        matrix[ro][col] = 101;

                }
            }

            for (int row = 0; row < rows; row++) {
                int[] currentArray = matrix[row];

                Arrays.sort(currentArray);


                matrix[row]= currentArray;
            }






            command = scanner.nextLine();
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col]!=101) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }

    }


}
