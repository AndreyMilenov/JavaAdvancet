package Z06PokemonTrainer;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Trainer trainer = null;
        Pokemon pokemon = null;

        Map<String,Trainer> trainerMap = new LinkedHashMap<>();

        while (!data.equals("Tournament")){
            String trainerName = data.split("\\s+")[0];
            String pokemonName = data.split("\\s+")[1];
            String pokemonElement = data.split("\\s+")[2];
            int pokemonHealth = Integer.parseInt(data.split("\\s+")[3]);

            pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

            trainer = new Trainer(trainerName,new ArrayList<>());
            trainer.getPokemonDeck().add(pokemon);


            if (trainerMap.containsKey(trainerName)){
                trainerMap.get(trainerName).getPokemonDeck().add(pokemon);
            }else {
                trainerMap.put(trainerName,trainer);
            }

            data= scanner.nextLine();
        }

        data = scanner.nextLine();
        while (!data.equals("End")){
            String element = data;

            for (Trainer trainer1 : trainerMap.values()){



                trainer1.takeDmg(trainer1, trainer.flag(element,trainer1));




            }
            data= scanner.nextLine();
        }
        List<Trainer> trainerList = new ArrayList<>(trainerMap.values());
        Collections.reverse(trainerList);

       trainerList.sort(Comparator.comparingInt(Trainer::getNumberOfBadges));

       Collections.reverse(trainerList);

       trainerList.forEach(System.out::println);

    }
}
