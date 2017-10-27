package heroes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private List<Class<? extends Character>> characterClasses = Arrays.asList(King.class,Hobbit.class);

    public Character createCharacter() throws IllegalAccessException, InstantiationException {
        Random random = new Random();
        int i = random.nextInt(characterClasses.size());
        Class<? extends Character> characterClass = characterClasses.get(i);
        Character character = characterClass.newInstance();
        return character;
    }
}
