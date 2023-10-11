package L05SetsAndMapsAdvancedLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> grates = new TreeMap<>();

        while (n-- > 0) {

            String name = scanner.nextLine();
            double grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).average().orElse(0);

            grates.put(name, grades);
        }

        DecimalFormat format = new DecimalFormat("0.####");

        grates.forEach((name, grade) -> System.out.printf("%s is graduated with %s%n",name,grade));

    }
}
