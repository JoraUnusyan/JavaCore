package FullLessons.lesson8.ObjectClass.Equals;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jora");
        Person p2 = new Person("Jora");
        Person p3 = new Person("Aram");
        String s = "Jora";

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(s));
        System.out.println(p1 == p2);
    }
}
