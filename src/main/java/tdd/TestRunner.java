package tdd;

import factory.InjectRandomInt;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

public class TestRunner {
    @SneakyThrows
    public void runAllTestMethods(Object o) {
        // find all methods starts with test
        Class<?> clazz = o.getClass();


        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                method.invoke(o);
            }
        }

    }
}
