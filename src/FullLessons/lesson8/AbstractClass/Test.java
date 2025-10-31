package FullLessons.lesson8.AbstractClass;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        // A a = new A(); A-n abstract e, iranic obyekt sarkel chi kareli, ink@ abstrakt baner grelu hamare
        b.callme(); // callme-i realizacyan b-i mej
        b.calmmeto();
    }
}
