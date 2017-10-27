package constructors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Parent {
    private int x;

    public Parent(int x) {
        this.x = x;
    }

    public Parent() {
    }
}
