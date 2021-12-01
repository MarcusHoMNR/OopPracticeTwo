package practice09;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> klasses = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.klasses = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public String introduce() {
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", this.klasses.size() == 0 ? "No Class" :
                "Class " + getAllKlasses()
        );
    }

    public String introduceWith(Student student) {
        return String.format(super.introduce() + " I am a Teacher. I %steach %s.", isTeaching(student)? "" : "don't ", student.getName());
    }

    private String getAllKlasses() {
        String allKlasses = "";
        for (Klass klass: klasses) {
            allKlasses += klass.getNumber() + (klass != klasses.getLast()? ", " : "");
        }
        return allKlasses;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: klasses) {
            if (student.getKlass().getNumber() == klass.getNumber()) {
                return true;
            }
        }
        return false;
    }
}
