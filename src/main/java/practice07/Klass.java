package practice07;

public class Klass {
    private int number;
    private Student leader;

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
        this.leader = student;
    }
}
