package aop_example;

import exceptions.FileNotFoundRuntimeException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
@Aspect
@EnableAspectJAutoProxy
public class ExceptionHanderAspect {


    @AfterThrowing(value = "execution(* *..*(..))", throwing = "ex")
    public void handleException(FileNotFoundRuntimeException ex) {
        System.out.println("sending mail to all teams "+ex.getMessage());
    }
}
