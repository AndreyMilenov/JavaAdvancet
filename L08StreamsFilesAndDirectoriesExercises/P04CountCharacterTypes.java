package L08StreamsFilesAndDirectoriesExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P04CountCharacterTypes {

    public static void main(String[] args) throws IOException {

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        FileReader fr = new FileReader("resources/Exercises Resources/input.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("resources/Exercises Resources/Output.txt"));
        int oneBite = fr.read();
        while (oneBite >= 0) {
            char symbol = covertToLowerCaseChar(oneBite);

            if (isVowel(symbol)) {
                vowels++;
            } else if (isPunctuation(symbol)) {
                punctuation++;
            } else if (!Character.isWhitespace(symbol)) {
                consonants++;
            }
            oneBite = fr.read();

        }
        fr.close();
        pw.println("Vowels: " + vowels);
        pw.println("Other symbols: " + consonants);
        pw.println("Punctuation: " + punctuation);
        pw.close();
    }

    private static char covertToLowerCaseChar(int oneByte){
        char symbol = (char) oneByte;
        String text = symbol +"";
        text.toLowerCase();
        return text.charAt(0);
    }

    private static boolean isPunctuation(char symbol) {
        return (symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?');
    }

    private static boolean isVowel(char symbol) {
        return (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u');


    }
}
