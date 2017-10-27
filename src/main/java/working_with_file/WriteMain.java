package working_with_file;

import lab1.Person;

import java.io.*;

public class WriteMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("c:/tmp/aaa.obj");
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        }
        Person person = new Person("Anton", 28, "Gorodetsky");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
    }
}
