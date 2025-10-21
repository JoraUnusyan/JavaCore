package FullLessons.lesson7.MethodOverload;

import java.sql.SQLOutput;

public class OverloadDemo {
    void test () {
                                                  //metodneri peregruzken mezi hnaravorucyun kuda nuyn anuni tak tarber
                                                   // metodner stexcel u tal iranc tarber parametrer

        //petke orinak or nuyn metod@ tarber tipi tvyalneri het krnanank ogtagorcenk
        // + petke or irar nman bayc parametrerov tarbervox metodneri hamar tarber anunner ch mtacenk
        // u ayl harmarucyunner kuda



        System.out.println("параметров еще нет");           //metodner@ bayc partadir bdi tarbervin parametreri
                                                           //qanakov, kam parametreri tipov, kam tiperi hertakanucyamp(voch anunov)
                                                         //bayc veradarcnox tip@ ete tarber exni (xoski double test kam int test) @dpes chi kareli
    }

    void test(int a) {
        System.out.println("a = " + a);
    }

    void test(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    double test (double a) {
        System.out.println("double a = " + a );
        return a * a;
    }








}
