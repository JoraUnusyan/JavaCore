package lesson2;

import java.sql.SQLOutput;

public class Example2 {
    public static void main(String[] args) {
    int x = 0;
        for (x = 0; x <= 10; x++) {
            x += 2;
             System.out.println("x = " + x);
        }
        System.out.println(x);          //qani or payman@ k stuke, nor mtnik@ meji kod@ kene heto x++, @dur hamar verjum
                                        //x=11 k stanank, bayc payman@ xaxtvac che vortev 9 <= 10, mtnik@ ira +2@ kene,
                                        // nor cikl@ k prcni. verji x++-i arcyunqne krnank arten ciklic dus sout-enelov
                                        // tesnink, vornor arten 12 k stanank
    }

}
