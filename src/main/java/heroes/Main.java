package heroes;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter();
        System.out.println(character);
        King arthur = new King();
        King ivanGrozniy = new King();
        while (arthur.isAlive()&&ivanGrozniy.isAlive()) {
            ivanGrozniy.kick(arthur);
            arthur.kick(ivanGrozniy);
        }
    }
}
