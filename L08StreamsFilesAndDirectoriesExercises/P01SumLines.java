package L08StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        String path = "resources/Exercises Resources/input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/Exercises Resources/input.txt"));

        String line = bufferedReader.readLine();
        while (line != null) {

            long sum = 0;
            char[] charactersFromLine = line.toCharArray();

            for (char character : charactersFromLine) {
                sum += character;
            }
            System.out.println(sum);
            line = bufferedReader.readLine();

        }
        bufferedReader.close();


    }
}
