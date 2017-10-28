package tdd;

import factory.Dog;
import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Reflections scanner = new Reflections("test");
        Set<Class<?>> subTypesOf = scanner.getSubTypesOf(Object.class);
        for (Class<?> aClass : subTypesOf) {

        }
        TestClass testObject = new TestClass();
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestMethods(testObject);
    }
}
