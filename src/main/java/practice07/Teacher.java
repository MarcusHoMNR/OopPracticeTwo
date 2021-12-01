package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", this.klass == null ? "No Class" : klass.getDisplayName());
    }

    public String introduceWith(Student student) {
        return String.format(super.introduce() + " I am a Teacher. I %steach %s.", student.getKlass().getNumber() == klass.getNumber()? "" : "don't ", student.getName());
    }
}
