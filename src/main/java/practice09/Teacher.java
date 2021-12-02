package practice09;

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

    @Override
    public String introduce() {
        String displayClass;
        if (this.klasses.size() == 0) {
            displayClass = "No Class";
        } else {
            displayClass = "Class " + getAllKlasses();
        }
        return String.format(super.introduce() + " I am a Teacher. I teach %s.", displayClass);
    }

    public String introduceWith(Student student) {
        String teachAction;
        if (isTeaching(student)) {
            teachAction = "teach";
        } else {
            teachAction = "don't teach";
        }
        return String.format(super.introduce() + " I am a Teacher. I %s %s.", teachAction, student.getName());
    }

    private String getAllKlasses() {
        return klasses.stream()
                .map(klass -> String.valueOf(klass.getNumber()))
                .collect(Collectors.joining(", "));
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass -> klass.isIn(student));
    }
}
