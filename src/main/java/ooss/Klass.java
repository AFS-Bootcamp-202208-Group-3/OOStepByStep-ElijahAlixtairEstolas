package ooss;

import java.text.MessageFormat;
import java.util.Objects;

public class Klass {
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void assignLeader(Student leader){
        if(leader.isIn(this)) {
            this.leader = leader;
            if(Objects.nonNull(watcher))
                watcher.printLeaderAssignmentMessage(leader.getName());
        }
        else
            System.out.println("It is not one of us.");
    }

    public void attach(Person person){
        watcher = person;
    }


    public boolean isLeader(Student student){
        return !Objects.isNull(this.leader) && this.leader.equals(student);

    }

    private int number;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }




    private Teacher teacher;
    private Student leader;
    private Person watcher;

}
