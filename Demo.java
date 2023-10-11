import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[0];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {

            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radios = Integer.parseInt(tokens[2]);

            for (int currentRow = row + radios; currentRow >= row - radios; currentRow--) {
                if (isInMatrix(matrix,currentRow,col)) {
                    matrix.get(currentRow).remove(col);
                }
            }

            for (int currentCol = col + radios; currentCol >= col - radios; currentCol--) {
                if (isInMatrix(matrix,row,currentCol)) {
                    matrix.get(row).remove(currentCol);
                }
            }


            command = scanner.nextLine();
        }
        printMatrix(matrix);
        matrix.removeIf(List::isEmpty);
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static boolean isInMatrix(List<List<Integer>> matrix, int rows, int cols) {
        return rows >= 0 && rows < matrix.size() && cols >= 0 && cols < matrix.get(rows).size();
    }


}
