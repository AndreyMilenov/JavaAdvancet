package L06SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String,String> emails = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {

                emails.put(input,email);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> pair : emails.entrySet()) {
            System.out.printf("%s -> %s%n",pair.getKey(),pair.getValue());
        }
    }
}
