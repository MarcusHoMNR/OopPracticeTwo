package practice07;

public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object person) {
        return id == ((Person)person).getId();
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

}
