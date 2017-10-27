package aop_example;

import exceptions.FileNotFoundRuntimeException;
import org.springframework.stereotype.Service;


@Service
public class LvivService {
    public void doWork() {
        System.out.println("working...");
        throw new FileNotFoundRuntimeException("file not founsd");
    }
}
