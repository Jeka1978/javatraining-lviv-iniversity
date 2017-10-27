package factory;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class AnimalFactory {

    private List<Class<? extends Animal>> animalClasses = new ArrayList<>();

    public AnimalFactory() {
        Reflections scanner = new Reflections("factory");
        Set<Class<? extends Animal>> classes = scanner.getSubTypesOf(Animal.class);
        for (Class<? extends Animal> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                animalClasses.add(aClass);
            }
        }
    }

    @SneakyThrows
    public Animal createRandomAnimal(){
        Random random = new Random();
        Class<? extends Animal> animalClass = animalClasses.get(random.nextInt(animalClasses.size()));
        Animal animal = animalClass.newInstance();
        Field[] fields = animalClass.getDeclaredFields();
        for (Field field : fields) {

            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int randomIntValue = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(animal,randomIntValue);

            }
        }
        return animal;
    }


    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        for (int i = 0; i < 10; i++) {
            Animal randomAnimal = factory.createRandomAnimal();
            randomAnimal.makeVoice();

        }
    }

}
