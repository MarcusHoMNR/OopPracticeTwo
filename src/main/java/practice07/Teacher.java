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

    @Override
    public String introduce() {
        String displayClass;
        if (this.klass == null) {
            displayClass = "No Class";
        } else {
            displayClass = klass.getDisplayName();;
        }
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", displayClass);
    }

    public String introduceWith(Student student) {
        String teachAction;
        if (student.getKlass().getNumber() == klass.getNumber()) {
            teachAction = "teach";
        } else {
            teachAction = "don't teach";
        }
        return String.format(super.introduce() + " I am a Teacher. I %s %s.", teachAction, student.getName());
    }
}
