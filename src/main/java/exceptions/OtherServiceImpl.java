package exceptions;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OtherServiceImpl implements OtherService {
    @Override
    public void doSomething() {
        FileService fileService = new FileService();
//        fileService.readFromFile(new File("c:\\temo"));
        throw new FileNotFoundRuntimeException("file not found");
    }

}
