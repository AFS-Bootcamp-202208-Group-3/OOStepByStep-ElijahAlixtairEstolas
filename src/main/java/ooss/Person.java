package ooss;

import java.text.MessageFormat;
import java.util.Objects;

public class Person {
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old.",
                this.name, this.age);
    }

    @Override
    public boolean equals(Object object){
        Person person = (Person) object;
        return this.id ==  person.id;
    }

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    private int age;


    public void printLeaderAssignmentMessage(String leaderName) {}

    String getClassNumbers() {
        return "";
    }


}
