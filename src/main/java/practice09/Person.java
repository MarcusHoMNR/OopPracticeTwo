package practice09;

import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public int getId() {
        return id;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object person) {
        if (!Objects.isNull(person))
            return id == ((Person) person).getId();
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

}
