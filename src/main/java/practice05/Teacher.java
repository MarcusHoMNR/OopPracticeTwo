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
        return String.format( super.introduce() + " I am a Teacher. I teach %s.", this.klass == 0 ? "No Class" : "Class " + this.klass);
    }
}
