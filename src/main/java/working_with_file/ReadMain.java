package working_with_file;

import lab1.Person;

import java.io.*;

public class ReadMain {

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        File file = new File("c:/tmp/aaa.obj");

        Person person = new Person("jack",12,"bor");


        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Object o = oos.readObject();
        System.out.println(o.getClass());
        if (o instanceof Person) {
            System.out.println(((Person) o).getName());
        }
    }
}
