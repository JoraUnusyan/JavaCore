package FullLessons.lesson11.Enum3;

import FullLessons.lesson11.Enums.Apple2;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;

        System.out.println("Яблоко сорта Winesap стоит " + Apple2.Winesap.getPrice() + " центов"); //qani or Apple2-@ pa
                                                                //suti nerqust inchxor klasse, Winesap-ne ira meji static obyekte,
                                                               //et obyektne uni getPrice metod@, krnank iran kanchenk spes
        System.out.println("Цены на все сорта яблок: ");
        for (Apple2 a : Apple2.values()) { //massiv sarkink iranic, vren fracink, hertov tpink
            System.out.println(a + "стоит " + a.getPrice() + " центов");
        }
    }
}
