package nl.novi.javaprogrammeren.one;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = age;
    }

    public void ageOneYear() {
        this.age++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
