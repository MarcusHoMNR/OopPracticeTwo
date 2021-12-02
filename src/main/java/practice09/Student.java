package practice09;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String roleOfClass;
        if (this.getName().equals(klass.getLeaderName())) {
            roleOfClass = "Leader of";
        } else {
            roleOfClass = "at";
        }
        return String.format(super.introduce() + " I am a Student. I am %s %s.", roleOfClass, klass.getDisplayName());
    }
}
