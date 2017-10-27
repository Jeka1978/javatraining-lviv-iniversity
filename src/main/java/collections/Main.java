package collections;

import lab1.Person;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person = new Person();

        people.add(person);
        people.add(person);
    }
}
