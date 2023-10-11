package L03MultidimensinalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int arraysCount = dimensions[0];
        int sizeOfArray = dimensions[1];

        int[][] first = new int[arraysCount][sizeOfArray];

        for (int i = 0; i < arraysCount; i++) {

            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            first[i] = arr;
        }

        arraysCount = scanner.nextInt();
        sizeOfArray = scanner.nextInt();

        int[][] second = new int[arraysCount][sizeOfArray];

        for (int r = 0; r < arraysCount; r++) {
            for (int c = 0; c < second[r].length; c++) {

                second[r][c] = scanner.nextInt();
            }
        }
        boolean areEqual = true;

        areEqual = isAreEqual(first, second, areEqual);
        System.out.println(areEqual ? "equal" : "not equal");

    }

    private static boolean isAreEqual(int[][] first, int[][] second, boolean areEqual) {

        if (first.length!= second.length){
            return false;
        }
        for (int r = 0; r < first.length; r++) {


            int[] firstArray = first[r];
            int[] secondArray = second[r];


            if (firstArray.length != secondArray.length) {
                areEqual = false;


            } else {
                areEqual = isEqual(areEqual, firstArray, secondArray);
            }
        }
        return areEqual;
    }

    private static boolean isEqual(boolean areEqual, int[] firstArray, int[] secondArray) {

        for (int i = 0; i < firstArray.length; i++) {
            int firstNumber = firstArray[i];
            int secondNumber = secondArray[i];

            if (firstNumber != secondNumber) {
                areEqual = false;
            }
        }
        return areEqual;
    }



}