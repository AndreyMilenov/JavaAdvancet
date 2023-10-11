package L04ExerciseMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();
         String rotationNumber = rotation.split("[()]")[1];
        int rotationNumberString = Integer.parseInt(rotationNumber);
        int angleOfRotation = 0;
        if (rotationNumberString >= 360) {
            angleOfRotation = (rotationNumberString % 360);
        } else {
            angleOfRotation = rotationNumberString;
        }
        String input = scanner.nextLine();

        List<String> wordList = new ArrayList<>();

        int maxLength = Integer.MIN_VALUE;
        while (!input.equals("END")) {

            wordList.add(input);

            if (input.length() > maxLength) {
                maxLength = input.length();
            }

            input = scanner.nextLine();
        }
        int rows = wordList.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String currentWord = wordList.get(row);
            for (int col = 0; col < cols; col++) {
                if (currentWord.length() > col) {
                    char currentChar = currentWord.charAt(col);

                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }

            }
        }
        switch (angleOfRotation) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col] + "");
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col] + "");
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col] + "");
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col] + "");
                    }
                    System.out.println();
                }
                break;
        }


    }
}
