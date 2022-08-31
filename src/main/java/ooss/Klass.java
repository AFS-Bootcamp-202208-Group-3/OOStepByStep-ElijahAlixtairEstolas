package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
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
            printLeaderAssignmentMessage(watcher, leader.getName());
            printLeaderAssignmentMessage(teacher, leader.getName());
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


    public void printLeaderAssignmentMessage(Person person, String leaderName) {
        if(Objects.nonNull(person))
            System.out.println(MessageFormat.format("I am {0}, {3} of Class {1}. I know {2} become Leader.",
                person.getName(),
                number, leaderName,
                person.getClass().getSimpleName().toLowerCase()));
    }


    private Teacher teacher;
    private Student leader;
    private Person watcher;

}
