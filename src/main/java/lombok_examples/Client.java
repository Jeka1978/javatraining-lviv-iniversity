package lombok_examples;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Client {
    @NonNull
    private String name;
    private String email;
    @NonNull
    private Integer discount;
    @Singular
    private List<String> beers;
}
