package aop_example;

import exceptions.FileNotFoundRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class KievService {
    public void doWork() {
        System.out.println("Kiev is the Capital city");
        throw new FileNotFoundRuntimeException("kiev not found");
    }
}
