package FullLessons.lesson5;

public class RightShift {
    public static void main(String[] args) {
        int a = 32; //skzbic es tesk@ uni - 00100011
        a = a >> 2;   //hmi uni es tesk@ - 00001000

        //aysinqn, 2 bit depi aj tarav, avelordner@ jnjec

        System.out.println(a); // =8, es formatov hakarak@ poqrnak@, bayc 0-ic poqr chi darna inchkane tiv@ hanenk >>
        //jamanak


        int b = -32; //1110 0000

        b = b >> 2;  //darav  1111 1000

        System.out.println(b); //tpec -8, bayc kyanqum chi exni aveli mec qanic -1;


        int c = 32;
        c = c >>> 2;  //drakan tveri depkum nuyn >>-i principov k ashxati
        System.out.println(c);


        int k = -32; // minusi depkum biterov es tesk@ uni 11111111 11111111 11111111 11100000
        k = k >>> 1;    //darav 00111111 11111111 11111111 11111000
        System.out.println(k);

        //aysinqn minusi depkum misht dzaxic zroner k avelcne 1-eri tex@, minus@ k kori, u ankap mec tver k stanank
    }
}
