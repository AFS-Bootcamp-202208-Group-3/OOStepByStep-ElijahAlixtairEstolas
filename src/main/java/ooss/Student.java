package ooss;

import java.util.Objects;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a student."+" I am in class "+this.klass.getNumber()+".";
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

}
