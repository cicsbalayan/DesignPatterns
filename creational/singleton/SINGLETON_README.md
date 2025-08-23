# Singleton Pattern

---

## Overview
The **Singleton Pattern** is a **creational design pattern** that ensures a class has **only one instance** and provides a **global point of access** to that instance.  

It is useful when exactly one object is needed to coordinate actions across the system (e.g., configuration, logging, database connections).

---

## Common Implementations in Java

#### Real-Life Example: Database Connection Manager

Imagine an application where multiple parts of the system (e.g., services, controllers, UI modules) need to **connect to the same database**.  

Creating a new connection object every time would be **inefficient** and could **overload the database**.

Instead, we use a **Singleton Database class** to ensure that only **one instance** of the database connection manager exists.

### Database Singleton
```java
package creational.singleton;

public class Database {

    // Private constructor to prevent instantiation
    private Database() {}

    // Static inner class responsible for holding the instance
    private static class Holder {
        private static final Database instance = new Database();
    }

    // Global access point
    public static Database getInstance() {
        return Holder.instance;
    }

    public void connect(String user) {
        System.out.println(user + " connected to the database.");
    }
}
```

