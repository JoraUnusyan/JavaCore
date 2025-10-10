package FullLessons.lesson3;

public class CastExample {
    public static void main(String[] args) {
        int a = 5555;
        byte b = (byte) a;
        System.out.println(b); // verji 24 bit@ kdrec, mnac 8 bit 01-i hamakargov, et 8 bitice arden inchor tiv kexni et
                               // 8 biteri hatvaci mej @nkac

        int c = -5555;
        byte d = (byte) c;
        System.out.println(d);


        byte t = 55;
        int h = t;
        System.out.println(h);

        double rt = 10.5;
        int ft = (int) rt;
        System.out.println(ft);


        byte ttt = 50;
        byte hhh = (byte) (ttt * 2);
        System.out.println(hhh);

        byte kl = 50 * 2;   //stex javai kompilyatr@ gide or tiv k gumarenk, toxnik@
        System.out.println(kl);

//        byte kc = 50;                    //stex chi toxni vortev kc - popoxakan e, u ink@ chide inch krna heto
//                                           popoxakani mej grvi
//        byte km = kc * 2;

//        int e = 555555;
//        byte g = e;
//        System.out.println(g); // chi kareli, kompilyacyai oshibka kuda, iran tuyltvucyun e petk
    }
}
