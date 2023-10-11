package L04ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P09ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = " ";
            }
        }
        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals("stop")) {
            String[] tokens = command.split("\\s+");
            int entryPoint = Integer.parseInt(tokens[0]);
            int parkingRow = Integer.parseInt(tokens[1]);
            int parkingCol = Integer.parseInt(tokens[2]);

            if (entryPoint > parkingRow) {
                if (matrix[parkingRow][parkingCol].equals(" ")) {
                    matrix[parkingRow][parkingCol] = "c";
                    for (int r = entryPoint; r >= parkingRow; r--) {
                        counter++;
                    }
                    counter += parkingCol;
                } else {
                    int left = 0;
                    int reith = 0;
                    for (int i = parkingCol; i < cols; i++) {
                        left++;
                        if (matrix[parkingRow][i].equals(" ")) {
                            break;
                        }
                    }
                    for (int i = parkingCol; i > 0; i--) {
                      reith++;
                    }
                }
            } else if (entryPoint < parkingRow) {

            } else {

            }


            command = scanner.nextLine();
        }
    }
}
