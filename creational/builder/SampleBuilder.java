package creational.builder;

public class SampleBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // Private constructor
    private SampleBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName  = builder.lastName;
        this.age       = builder.age;
        this.email     = builder.email;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public SampleBuilder build() {
            return new SampleBuilder(this);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ") - " + email;
    }
}
