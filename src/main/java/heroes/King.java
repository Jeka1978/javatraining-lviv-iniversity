package heroes;

import lombok.Setter;

import java.util.Random;

public class King extends Character {
    @Setter
    private KickBehaviour kickBehaviour = new SwordKickBehaviour();

    public King() {
        Random random = new Random();
        setHp(random.nextInt(100)+5);
        setPower(random.nextInt(10)+5);
    }


    @Override
    public void kick(Character enemy) {
        if (getHp() < 5) {
           setKickBehaviour(new KickBehaviour() {
               @Override
               public void kick(Character character, Character defender) {
                   System.out.println("know I'm fighting with knife");
               }


           });
        }
        kickBehaviour.kick(this,enemy);
    }
}
