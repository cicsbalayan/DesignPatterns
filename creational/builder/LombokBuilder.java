package creational.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
