package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileService {
    public void readFromFile(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
    }


}
