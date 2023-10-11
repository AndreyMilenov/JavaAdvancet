package Z06PokemonTrainer;

import java.util.Iterator;
import java.util.List;

public class Trainer {
    private String name;

    private int numberOfBadges;

    private List<Pokemon> pokemonDeck;

    public Trainer(String name, List<Pokemon> pokemonDeck) {
        this.name = name;

        this.pokemonDeck = pokemonDeck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemonDeck() {
        return pokemonDeck;
    }

    public void setPokemonDeck(List<Pokemon> pokemonDeck) {
        this.pokemonDeck = pokemonDeck;
    }

    public boolean flag(String element,Trainer trainer){
        boolean flag = true;
        for (Pokemon pokemon:trainer.getPokemonDeck()){
            if (pokemon.getElement().equals(element)){
                flag = false;

            }
        }
        return flag;
    }
    public void takeDmg(Trainer trainer,boolean flag){

        Iterator<Pokemon> iterator = pokemonDeck.iterator();

        if (flag){
            for (Pokemon pokemon : trainer.getPokemonDeck()){
                int currentHealth = pokemon.getHealth();
                pokemon.setHealth(currentHealth-10);

            }
            while (iterator.hasNext()) {
                Pokemon pokemon = iterator.next();
                int currentHealth = pokemon.getHealth();
                if (currentHealth <= 0) {
                    iterator.remove();
                }
            }


        }else {
            numberOfBadges++;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %d %d",name,numberOfBadges,pokemonDeck.size());
    }
}
