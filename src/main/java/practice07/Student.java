package practice07;



public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format(super.introduce() + " I am a Student. I am %s %s.", this.getName().equals(klass.getLeaderName())? "Leader of" : "at", klass.getDisplayName());
    }
}
