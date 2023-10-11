package L06SetsAndMapsAdvancedExercises;


import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> compoundsSet = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {
            String[] compound = scanner.nextLine().split("\\s+");
            for (String element : compound){
                compoundsSet.add(element);
            }
        }
        String result = String.join(" ",compoundsSet);
        System.out.println(result);
    }
}
