package FullLessons.lesson7.PrivateTest;

public class PrivateTestDemo {
    public static void main(String[] args) {
        PrivateTest t = new PrivateTest();
        t.a = 10;
        t.b = 20;
        //t.c = 22;
        t.setc(10); //cherez metod drink
        System.out.println(t.getc()); //cherez metod hanink
    }
}
