package FullLessons.lesson8.ObjectClass.getClass;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("МЕНЯ ЗОВУТ " + name);
    }
}
