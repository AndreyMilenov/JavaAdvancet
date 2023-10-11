package L08StreamsFilesAndDirectoriesExercises;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path firstFile = Paths.get("resources/Exercises Resources/inputOne.txt");
        List<String> firstFileLines = Files.readAllLines(firstFile);
        for (String firstFileLine : firstFileLines) {
            System.out.println(firstFileLine);
        }

        Path secondFile = Paths.get("resources/Exercises Resources/inputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(secondFile);
        for (String secondFileLine : secondFileLines) {
            System.out.println(secondFileLine);
        }
        Path output = Paths.get("resources/Exercises Resources/Output.txt");
        Files.write(output,firstFileLines, StandardOpenOption.APPEND);
        Files.write(output,secondFileLines, StandardOpenOption.APPEND);


    }
}
