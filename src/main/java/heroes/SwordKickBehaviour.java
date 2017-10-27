package heroes;

import java.util.Random;

public class SwordKickBehaviour implements KickBehaviour {
    private Random random = new Random();
    @Override
    public void kick(Character character, Character defender) {
        System.out.println("I'm fighting with a sword");
        int damage = random.nextInt(character.getPower()+1);
        defender.setHp(defender.getHp()-damage);
    }
}
