package practice10;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Teacher teacher;
    private Student leader;
    private final List<Student> studentList = new ArrayList<>();

    public boolean isIn(Student student) {
        return number == student.getKlass().getNumber();
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public Student getLeader() {
        return leader;
    }

    public String getLeaderName() {
        return leader == null ? null : leader.getName();
    }

    public void assignLeader(Student student) {

        if (studentList.contains(student)) {
            if (teacher != null) {
                System.out.printf("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number);
            }
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void appendMember(Student student) {
        if (teacher != null) {
            System.out.printf("I am %s. I know %s has joined Class %d.\n", teacher.getName(),student.getName(), number);
        }
        studentList.add(student);
    }

}
