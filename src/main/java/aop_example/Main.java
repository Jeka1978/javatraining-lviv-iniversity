package aop_example;

import exceptions.FileNotFoundRuntimeException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        LvivService lvivService = context.getBean(LvivService.class);
        try {
            lvivService.doWork();
        } catch (FileNotFoundRuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("anyway will be invoked");
        }

        KievService kievService =new KievService();
        kievService.doWork();
    }
}
