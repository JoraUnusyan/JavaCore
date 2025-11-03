package FullLessons.lesson10.exc1;

public class exc1 {
    public static void main(String[] args) {
        int d = 0;
        int a = 10;
        int c = a / d;             //qani or sxal@ ruchnoy chenk brne, kerta standart obrabotchik@ javai k brne. obyekt@
                                   // iskluchenyai k sarke u kuda.
                                  // u k kangncne cragir@ meankamic

        //!!!!!!!!!!// Irakanum et ameninch@ kompilyacyai vaxt k parzabanvi, aysinqn JVM-@ or baytkod@ k karda,
        //instrukcyaner@ kene, ira mej inchxor stukum erta or xoski ete chidem inch@ == 0, sarke bacarucyan obyekt@ u sa
        // or et depkum es tipie sxal@, u han es text@ (xoski :/by zero)

        System.out.println(c); //Exception in thread "main" java.lang.ArithmeticException: / by zero
                                  //at FullLessons.lesson10.exc1.exc1.main(exc1.java:7)

                           //stex cuyc kuda te urdexice eke sxal@ u konkret vor paketi vor klassi vor toxi meje
    }
}
