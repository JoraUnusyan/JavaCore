package FullLessons.lesson11.EnumDemo4;
import FullLessons.lesson11.Enums.Apple;
public class EnumDemo4_Methods {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("Все константы сортов яблок " + " и их порядкеовые значение: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal()); //ordinal metod@ ka arten Enum-neri mej, vortev sax jarangvink@ Enum classic
                                                     // ink@ zut hertakanucyun@ kse, te vor mek@ vor indexi take karelie sel
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if(ap.compareTo(ap2) < 0){  //compareTo-n hamematucyun kene, ete ap_@ ap-2ic shut guka cucakov, sxal kuda
                                    // ete ush - true kuda, ete havasaren - 0 k veradarcne
            System.out.println(ap + " предшествует " + ap2);
        }

        if(ap.compareTo(ap2) > 0){
            System.out.println(ap + " предшествует " + ap2);
        }

        if(ap.compareTo(ap3) == 0){
            System.out.println(ap + " ровно " + ap2);
        }
        System.out.println();
        System.out.println();

        if(ap.equals(ap2)){               //equals@ stex Object-i equals@ @dkane che vortev ink@ override e exac Enum klassi mej
                                        // u kene stex nuyn gorcoxucyun@ vornor kene ==-n
            System.out.println("Ошибка!");
        }

        if(ap.equals(ap3)){
            System.out.println("равны");
        }

        if(ap == ap3){
            System.out.println("и так равны");
        }





    }
}
