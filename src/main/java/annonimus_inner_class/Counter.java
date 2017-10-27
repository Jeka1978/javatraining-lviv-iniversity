package annonimus_inner_class;

import lombok.Data;

@Data
public class Counter {
    private int x;

    public void inc() {
        x++;
    }

}
