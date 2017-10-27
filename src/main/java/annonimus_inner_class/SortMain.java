package annonimus_inner_class;

import lab1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "Groovy", "C#", "visual basic");




        list.sort((o1, o2) -> o1.length() - o2.length());




        System.out.println(list);
    }
}
