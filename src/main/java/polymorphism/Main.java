package polymorphism;

import lab1.Person;

public class Main {
    public static void main(String[] args) {


        Orchestra orchestra = new Orchestra();

        orchestra.addMusician(new Guitarist());
        orchestra.addMusician(new Pianist());
        orchestra.addMusician(new Pianist());
        orchestra.addMusician(new Musician() {
            public void playGamma() {
                System.out.println("tu tu tu tu");
            }

        });
        orchestra.playMusic();
    }
}
