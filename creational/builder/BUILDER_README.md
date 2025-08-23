# Builder Pattern in Java

### Overview
The **Builder Pattern** is a **creational design pattern** that provides a flexible solution to constructing **complex objects step by step**.

Instead of using constructors with long parameter lists (known as the *telescoping constructor problem*), the Builder Pattern introduces a fluent, readable way to create objects while supporting immutability and optional parameters.

---

##  The Problem (Without Builder)

Consider a class with multiple fields:

```java
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.email     = email;
    }
}
```

Problems:
- Harder to read → "Doe", 25, "john@example.com" (what do these values mean?).
- Constructors with many parameters are error-prone.
- Adding optional fields forces more constructors → constructor explosion.

---

```java
package creational.builder;

public class SampleBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

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

```
This allows the developer to apply:
- A more readable construct
- Flexible adding of parameters
- Concerns can be seperated

### Sample case

```java
public class Main {
    public static void main(String[] args) {
        SampleBuilder user = new SampleBuilder.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(25)
                .email("john@example.com")
                .build();

        System.out.println(user);
    }
}
// Output from toString function
// John Doe (25) - john@example.com

```

---
## Here is a trick for a cleaner version in Java

Instead of writing boilerplate manually, we can use Lombok’s @Builder.

Lombok is a library to make entities reduce boilerplate code. (e.g, Getters & Setters, Constructors, Validators. etc)

```java
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
```

This is still the follows the same format as the main class earlier. 
Though there are libraries or built-in features that can do this too in other languages!

---

## When to use builder pattern

- Classes with many fields (esp. optional ones).
- When you want readable and maintainable object creation.
- When immutability is desired.

