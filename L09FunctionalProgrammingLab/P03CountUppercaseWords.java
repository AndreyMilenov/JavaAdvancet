package L09FunctionalProgrammingLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isStartingWithUpperCase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> stackOfWords = new ArrayDeque<>();

        Arrays.stream(words)
                .filter(isStartingWithUpperCase)
                .forEach(stackOfWords::offer);

        System.out.println(stackOfWords.size());
        while (!stackOfWords.isEmpty()){
            System.out.println(stackOfWords.poll());
        }
    }
}
