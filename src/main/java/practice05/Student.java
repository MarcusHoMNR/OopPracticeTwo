package practice05;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Student. I am at Class %d.", this.getName(), this.getAge(), this.klass);
    }
}
