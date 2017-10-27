package lombok_examples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder().name("jeka").discount(100).email("sdas@ssd,com").beer("Tuher").beer("Goldstar").build();

        System.out.println("client = " + client);
    }
}
