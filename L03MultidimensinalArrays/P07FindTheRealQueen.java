package L03MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];
        boolean isReal = true;

        for (int r = 0; r < 8; r++) {
            String[] currentArr =  scanner.nextLine().split("\\s+");
            for (int c = 0; c < 8; c++) matrix[r][c] = currentArr[c];
        }


            for (int row = 0; row < 8; row++) {
                for (int cow = 0; cow < 8; cow++) {
                    if (matrix[row][cow].equals("q")) {
                        isReal = isRealQueen(matrix, row, cow);
                        if (!isReal){
                            System.out.println(row+" "+cow);
                            return;
                        }
                    }

                }
            }


    }

    private static boolean isRealQueen(String[][] matrix, int row, int cow) {
        int co = cow;

        for (int i = 0; i < 8; i++) {
            if (matrix[row][i].equals("q") && !(i == cow)) {
                return true;
            }
        }
        for (int r = 0; r < 8; r++) {
            if (matrix[r][cow].equals("q") && !(r == row)) {
                return true;
            }
        }
        for (int r = row - 1; r >= 0; r--) {
            co--;
            if (co>=0) {
                if (matrix[r][co].equals("q")) {
                    return true;
                }
            }
        }
        co = cow;
        for (int r = row + 1; r < 8; r++) {
            co++;
            if (co<8) {
                if (matrix[r][co].equals("q")) {
                    return true;
                }
            }
        }
        co = cow;
        for (int r = row - 1; r >= 0; r--) {
            co++;
            if (co < 8) {
                if (matrix[r][co].equals("q")) {
                    return true;
                }
            }
        }
        co=cow;
        for (int r = row + 1; r < 8; r++) {
            co--;
            if (co >=0 ) {
                if (matrix[r][co].equals("q")) {
                    return true;
                }
            }
        }

      return false;
    }
}
