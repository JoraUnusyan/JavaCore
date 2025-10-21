package FullLessons.lesson7.Recursia;

public class recursia {
    static void countDown(int n) {
        if (n == 0) return;  //ep or n-@ havasarvav 0-i, nor rekursyan k kangni, ete payman chtank anverj metod@ ink@ iran
                             // k kanche minchev hishoxucyun@ ch lcne u oshibka ta

        System.out.println(n + " "); // stex k statnank 5 4 3 2 1 vortev metodner@ pauzi mejen, bayc n-1-@ k katarvi
                                     // heto guka k hasni metodin

        countDown(n - 1);  // stex skzbic n=5, ira 5-1-@ ink@ k poxance muys kanchin, l@ chi exe, heto guka muys
        //kanch@ darnak 4. inqne pauzi k @ngni, heto guka muys kanch@ darnak@ 3, inqne pauzi vra, u epor k hasni 0-i
        //arten kangnink@,bayc voch te sax rekursyan ayl menak es pahi kanch@. u amen me stop exac metod, k sharunake
        //ancnel muys toxin ira stop exac hertakanucyan@ hakarak, aysinqn 1-in@ miacav, gnac sout erav 1-@, heto
        //2-ord@ miacav gnac sout erav 2 ev ayln

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        countDown(5);
    }
}
