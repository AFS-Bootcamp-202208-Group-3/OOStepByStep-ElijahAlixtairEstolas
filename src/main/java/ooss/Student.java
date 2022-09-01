package ooss;

import java.text.MessageFormat;
import java.util.Objects;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a student."+
                printClassAndLeaderMessage();
    }

    @Override
    public void printLeaderAssignmentMessage(String leaderName) {
        if(Objects.nonNull(this))
            System.out.println(MessageFormat.format("I am {0}, {3} of Class {1}. I know {2} become Leader.",
                    this.getName(),
                    getClassNumbers(),
                    leaderName,
                    "student"));
    }

    private String printClassAndLeaderMessage() {
        if(Objects.isNull(klass)) return "";
        if(klass.isLeader(this)){
            return generateLeaderMessage();
        }
        return printClassNumber() +
                generateLeaderMessage();
    }

    private String printClassNumber() {
        return Objects.isNull(klass) ? "" : MessageFormat.format(" I am in class {0}.", klass.getNumber());
    }

    private String generateLeaderMessage() {
        if(Objects.nonNull(klass) && klass.isLeader(this))
            return MessageFormat.format(" I am the leader of class {0}.",klass.getNumber());
        else
            return "";
    }

    public boolean isIn(Klass klass){
        return !Objects.isNull(this.klass) && this.klass.equals(klass);
    }

    public void join(Klass klass){
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }

    @Override
    String getClassNumbers() {
        return String.valueOf(klass.getNumber());
    }

}
