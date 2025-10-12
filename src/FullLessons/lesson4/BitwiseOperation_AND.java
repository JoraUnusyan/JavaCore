package FullLessons.lesson4;

public class BitwiseOperation_AND {
    public static void main(String[] args) {
        int a = 12; //biterov 1100
        int b = 10; //biterov 1010

        // & = u / nayev

        //hamematvik@ hetevyal kerp
        //  1 1 0 0
        //  1 0 1 0
        //  = = = =
        //  1 0 0 0
        //aysinqn ete 2 bitne 1-e, nor k dne 1, ete che - uremn sax mnacac depkerum k dne 0

        //

        int c = a & b;
        System.out.println(c); //stacank 8, vortev 8@ biteri teskov 1000 e

        if (a > b & b == a) {    //tarbervik@ &&-ic @nurov or erku paymanne k stuke daj@ ete mek@ arten false e
            //u avelord nagruzka kuda, avel lave &&-ov stukel
            System.out.println("OK");
        }

        if (a > b && b == a) {
            System.out.println("ok");
        } //naxntrelie &&-ov grel spes baner@ vortev ete arajin@ false exav el erkrordin chi ancni.


    }
}
