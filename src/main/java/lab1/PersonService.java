package lab1;

import java.util.Arrays;
import java.util.List;

public class PersonService {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("str", "java", "Lviv");
        for (String word : words) {
            System.out.println(word);
        }


        System.out.println(123);
        int x = 19;
        System.out.println(123);
        System.out.println(123);
        x--;
        System.out.println(123);
        x = x + 10;
        System.out.println(123);
        System.out.println(x);
    }

    public void savePerson(Person person) {
        System.out.println("saving... " + person);
    }
}
