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

    @Override
    public String introduce() {
        String displayClass;
        if (this.klass == 0) {
            displayClass = "No Class";
        } else {
            displayClass = "Class " + this.klass;
        }
        return String.format( super.introduce() + " I am a Teacher. I teach %s.", displayClass);
    }
}
