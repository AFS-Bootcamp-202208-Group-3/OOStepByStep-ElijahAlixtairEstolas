package ooss;

import java.text.MessageFormat;

public class Person {
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return MessageFormat.format("My name is {0}. " +
                "I am {1} years old.",
                this.name, this.age);
    }



    private int id;
    private String name;
    private int age;





}
