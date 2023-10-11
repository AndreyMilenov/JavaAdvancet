package L08StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new FileReader("resources/Exercises Resources/words.txt"));
        String[] wordsToSearch = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : wordsToSearch) {
            map.put(word, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader("resources/Exercises Resources/text.txt"));
        String singleWord = fileScanner.next();
        while (fileScanner.hasNext()) {
            if (map.containsKey(singleWord)) {
                int occurrences = map.get(singleWord);
                map.put(singleWord, occurrences + 1);
            }
            singleWord = fileScanner.next();
        }
        PrintWriter pw = new PrintWriter(new FileWriter("resources/Exercises Resources/result.txt"));

        map.entrySet().stream().sorted((f,s) -> s.getValue()-f.getValue()).forEach(entry -> pw.printf("%s - %d%n", entry.getKey(), entry.getValue()));

        scanner.close();
        fileScanner.close();
        pw.close();
    }
}
