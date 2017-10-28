package mySpring;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
