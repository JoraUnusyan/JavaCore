package FullLessons.lesson7.ConstructorOverload;

public class Box {
                                   //metodneri peregruzki principov kashxati, nuyn tarberucyunner@ bdi exnin
                                   // peregruzka eneluc parametreri mej, petke or obyektner sarkeluc krnanank
                                   // tarber skzbnakan parametrerov sarkenk
    double width;
    double height;
    double depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
    //karelie naev kanstruktr@ kanstrukti mej kanchel, or aveli harmar exni, xoski
    // orinak epor 2 ban krnan tan, 3-ord@ l@ haytni che, karelie spes enel

    Box(double a, double b, String oi) {
        System.out.println("a");

    }



    Box(double a, double b) {
        this(a, b, "hello");

    }


}
