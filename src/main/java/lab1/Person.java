package lab1;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable, Comparable<Person>{

    @Setter
    private String name;

    @Getter
    private transient int age;
    private String family;


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
