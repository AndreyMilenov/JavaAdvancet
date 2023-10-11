package Z09CatLady;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

         HashMap<String,Cat> catHashMap = new HashMap<>();

        while (!line.equals("End")){
            String[] catData = line.split("\\s+");

            String catBreed = catData[0];
            String catName = catData[1];

            Cat cat = null;

            switch (catBreed){
                case "StreetExtraordinaire":
                    double decibels = Double.parseDouble(catData[2]);
                    cat = new StreetExtraordinaire(catName,decibels);
                    break;
                case "Siamese":
                    double earSize = Double.parseDouble(catData[2]);
                    cat = new Siamese(catName,earSize);

                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(catData[2]);
                    cat = new Cymric(catName,furLength);

                    break;
            }
            catHashMap.put(catName,cat);

            line = scanner.nextLine();
        }
        String catNameToSearch = scanner.nextLine();
        if (catHashMap.containsKey(catNameToSearch)){
            System.out.println(catHashMap.get(catNameToSearch));
        }
    }
}
