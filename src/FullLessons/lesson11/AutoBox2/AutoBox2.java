package FullLessons.lesson11.AutoBox2;

public class AutoBox2 {
    public static void main(String[] args) {
        Integer a, b;
        int i;

        a = 100; //upakovka
        System.out.println("Исходное значение а: " + a); //raspakovka
        ++a;//raspakovka, ++
        System.out.println("а После: " + a);

        b = a + (a / 3); // stex skzbic raspakovka kene a-er@ or hetner@ ashxati, heto eli upakovka kene or b-i mej pahvin
        System.out.println("b случай 1: " + b);

        i = a + (a/3); //stex prost@ raspakovka kene u i-i meje pahek@, vortev i-n int e spes te mpes el upakovka ur ene
        System.out.println("i после: " + i);

    }
}
