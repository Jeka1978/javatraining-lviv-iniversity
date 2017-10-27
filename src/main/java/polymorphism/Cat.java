package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animal {


    @Override
    public void makeVoice() {
        System.out.println("mau");
    }


    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}
