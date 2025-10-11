package FullLessons.lesson5;

public class No_Or {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a ^ b;
        System.out.println(c); // ^- k nshanake menak mekne chisht. bayc voch erkus@

        //logikan biteri kashxati hetevyal kerp - ete tveric mek@ 1 e, k darcne 1, bayc ete erkusne 1 en kam 0 - k
        //darcne 0, inchxor se "kam mek@ kam muys@"


        if ((a ^ b) != 0) {                 //tveri mej ka tarberucyun - true
            System.out.println("ka");
        }

        int k = 4;                 // tveri mej chka tarberucyun - chi ashxati, false
        int t = 4;
        if ((k ^ t) != 0) {  //!=0 uxaki if@ ashxatcnelu hamare, konkret k^t-i vra chi azde.
            System.out.println("chka");
        }


    }
}
