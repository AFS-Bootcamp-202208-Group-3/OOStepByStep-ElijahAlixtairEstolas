package ooss;

import java.text.MessageFormat;
import java.util.*;
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
                printClassNumber();
    }

    @Override
    public void printLeaderAssignmentMessage(String leaderName) {
        if(Objects.nonNull(this))
            System.out.println(MessageFormat.format("I am {0}, {3} of Class {1}. I know {2} become Leader.",
                    this.getName(),
                    getClassNumbers(),
                    leaderName,
                    "teacher"));
    }

    private String printClassNumber() {
        if(klasses.isEmpty()) return "";
        return " I teach Class " +
                getClassNumbers() + "."; //use MessageFormat
    }


    @Override
    String getClassNumbers() {
        return klasses.stream()
                .map(klass -> String.valueOf(klass.getNumber()))
                .collect(Collectors.joining(", "));
    }

    public boolean isTeaching(Student student){
        return klasses.contains(student.getKlass());
    }

}
