package FullLessons.lesson8.AbstractClass2;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(9, 4);
        Figure f; // chnayac @nur or obyekt chi kareli sarkel, Figure tipi ssilka menk meke krnank sarkenk.


        f = r;
        System.out.println(f.area());

        f = t;
        System.out.println(f.area());

    }
}
