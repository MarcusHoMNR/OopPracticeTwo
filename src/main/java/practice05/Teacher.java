package practice05;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", this.getName(), this.getAge(), this.klass == 0 ? "No Class" : "Class " + this.klass);
    }
}
