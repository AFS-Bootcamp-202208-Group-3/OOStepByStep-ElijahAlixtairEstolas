package ooss;

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
        if(leader.isIn(this))
            this.leader = leader;
        else
            System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student){
        return !Objects.isNull(this.leader) && this.leader.equals(student);
    }

    private int number;
    private Student leader;

}
