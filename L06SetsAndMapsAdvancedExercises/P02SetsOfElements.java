package L06SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] setSizes = scanner.nextLine().split("\\s+");

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        int firstSetSize = Integer.parseInt(setSizes[0]);
        int secondSetSize = Integer.parseInt(setSizes[1]);

        for (int i = 0; i < firstSetSize; i++) {
            String element = scanner.nextLine();
            firstSet.add(element);
        }
        for (int i = 0; i < secondSetSize; i++) {
            String element = scanner.nextLine();
            secondSet.add(element);
        }

        for (String element : firstSet) {
            if (secondSet.contains(element)) {
                System.out.print(element + " ");
            }
        }
    }

}
