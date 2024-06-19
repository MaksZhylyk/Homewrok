package lesson41;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private boolean education;

    public Person(String name, int age, boolean education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", education= " + education +
                '}';
    }
}
