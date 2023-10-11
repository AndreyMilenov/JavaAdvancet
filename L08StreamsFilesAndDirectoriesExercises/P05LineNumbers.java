package L08StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("resources/Exercises Resources/inputLineNumbers.txt"));
        PrintWriter pr = new PrintWriter(new FileWriter("resources/Exercises Resources/Output.txt"));
        String line = br.readLine();
        int counter = 1;
        while (line != null) {
            pr.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        br.close();
        pr.close();
    }
}
