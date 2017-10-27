package tdd;

import factory.Dog;

public class Main {
    public static void main(String[] args) {
        TestClass testObject = new TestClass();
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestMethods(testObject);
    }
}
