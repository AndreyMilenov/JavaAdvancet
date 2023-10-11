package L03MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] current = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                firstMatrix[row][col] = current[col];
            }


        }
        for (int row = 0; row < rows; row++) {
            String[] current = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = current[col];
            }


        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])){
                    System.out.print(firstMatrix[row][col]+" ");
                }else {
                    System.out.print("*"+" ");
                }

            }
            System.out.println();
        }

    }
}
