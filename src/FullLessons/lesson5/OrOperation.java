package FullLessons.lesson5;

public class OrOperation {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a | b;
        System.out.println(c);  // = 7

        //vortev 0111@ biteriv = 7

        // | - k nshanake kam

        // ink@ erku tveri biter@ es dzev k vercne
 /*     0 | 0 = 0
        1 | 0 = 1
        0 | 1 = 1
        1 | 1 = 1

        aysinqn ete biteric gone mek@ havasar e 1-i, guka 1
        i tarberucyun &-i, urdex or erkusne bdi 1 exnin or 1 ga

        */

        if (a > b | b == 3) {
            System.out.println("3");
        }  //erkusne k stuke, ete arajin@ true exni meke erkrodine kancni

        if (a > b || b == 3) {
            System.out.println("3");
        } // || -i depkum ete arajin@ true exav el erkrodin chie ancni, kerta gorc@ kene

        //biteri metodov inchxor 0-ner@ anjtac@ exni
        // 1-er@ myacrac@, u ete erkusic gone 1-i mej myacrac ka, payman@ chisht kexni


    }
}
