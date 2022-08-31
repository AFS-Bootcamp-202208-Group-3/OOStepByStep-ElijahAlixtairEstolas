package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> klasses;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klasses = new ArrayList<>();
    }

    public boolean belongsTo(Klass klass){
        return klasses.contains(klass);
    }

    public void assignTo(Klass klass){
        if(!belongsTo(klass))
            klass.setTeacher(this);
            klasses.add(klass);

    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a teacher." +
                " I teach Class "+
                getClasses() +".";
    }

    private String getClasses() {
        return klasses.stream()
                .map(klass ->
                        String.valueOf(klass.getNumber()
                        )
                ).collect(Collectors.joining(", "));
    }

    public boolean isTeaching(Student student){
        return klasses.contains(student.getKlass());
    }

}
