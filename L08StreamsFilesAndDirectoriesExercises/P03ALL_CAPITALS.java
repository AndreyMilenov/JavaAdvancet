package L08StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.Locale;

public class P03ALL_CAPITALS {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("resources/Exercises Resources/Output.txt"));

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/Exercises Resources/input.txt"));

        bufferedReader.lines().forEach( line -> pw.println(line.toUpperCase()));
        bufferedReader.close();
        pw.close();

    }
}

