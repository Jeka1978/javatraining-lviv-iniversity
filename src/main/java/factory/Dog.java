package factory;

import lombok.Getter;

@Getter
public class Dog implements Animal {

    @InjectRandomInt(min = 150, max = 550)
    private int maxSpeed;

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }

    public void testDog() {
        System.out.println(maxSpeed);
    }
}
