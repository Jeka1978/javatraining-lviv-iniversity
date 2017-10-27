package polymorphism;

import lab1.Person;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {

    private List<Musician> band = new ArrayList<>();

    public void addMusician(Musician musician) {
        band.add(musician);
        printNames("John Snow","Ned Stark");
    }

    public void printNames(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void playMusic() {
        for (Musician musician : band) {
            musician.playGamma();
        }
    }

}
