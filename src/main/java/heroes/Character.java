package heroes;

import lombok.Data;

@Data
public abstract class Character {
    private int hp;
    private int power;

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void kick(Character enemy);
}
