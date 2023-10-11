package L04ExerciseMultidimensionalArrays;


import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizes = scanner.nextLine();

        int rows = Integer.parseInt(sizes.split(" ")[0]);
        int cols = Integer.parseInt(sizes.split(" ")[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] currentArray = scanner.nextLine().split(" ");
            matrix[row] = currentArray;
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] commandParts = command.split(" ");
            if (command.contains("swap") && commandParts.length == 5) {
                int firstPositionRow = Integer.parseInt(commandParts[1]);
                int firstPositionCol = Integer.parseInt(commandParts[2]);
                int secondPositionRow = Integer.parseInt(commandParts[3]);
                int secondPositionCol = Integer.parseInt(commandParts[4]);

                if (isValidCommand(firstPositionRow, firstPositionCol, secondPositionRow, secondPositionCol, rows, cols)) {
                    String firstToSwap = matrix[firstPositionRow][firstPositionCol];
                    matrix[firstPositionRow][firstPositionCol] = matrix[secondPositionRow][secondPositionCol];
                    matrix[secondPositionRow][secondPositionCol] = firstToSwap;
                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }


            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }

    public static boolean isValidCommand(int firstRow, int firstCol, int secondRow, int secondCol, int rows, int cols) {
        return firstRow < rows && firstCol < cols && secondRow < rows && secondCol < cols;

    }
}
