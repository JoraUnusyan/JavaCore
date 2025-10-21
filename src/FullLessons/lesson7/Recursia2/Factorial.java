package FullLessons.lesson7.Recursia2;

public class Factorial {
    int fact(int n) {
        int result;
        if(n == 1) return 1;  //epor n-@ havasarvav 1-i return kene 1, vornor k veradarna kanchac metodi mej
                             // aysinqn fact (n-1)-i texum k haytnvi et 1-@ return exac u kexni * n:
                             // u et pahic sksac arten sarac metodner@ k sksen ashxatel, u amen return result-@ nuyn
                             // logikayov bere ira tiv@ dnek@ metodi tex@ u kene * n

                               //result = fact(1) * 2; -ic inchxor darna
                               // result = 1 * 2;  //sik ete inch meji 1-@ che, uxaki funkciayi tex@ berec et 1-@ drav
                              // u bazmapatkec n-in,

       //n-1-@ chi meankamic sarke 4, ink@ k poxance muys kanchin -1, @Dur hamar demic ete xoski 5 kudank
        //5-n e het@ guka k sarcne, heto nor muys kanchin -1 kene, 4-@ k sarcne

        result = fact(n - 1) * n;
        return result;               //stex hmi amen ankam n-@ guka -1 kexni, sari u mnak@, sksac mer tvac tvic
                                        // * n-@ het sari mnak@, et pahi tvac n-ov.

                                     //inchxor tvink argument 4@, ekav sav 4 * n-kangnav, heto myame ekav 3 * n u kangnav
                                     // u @dpes minchev 1-@, henc hasav 1-in, return kene 1@, et 1@ guka k bazmapatkvi
                                     // 2-uv k darna 2, hmi kexni return result, result-@ guka iran kanchac tex@
                                        //aysinqn metodi tex@ u kexni 2 * 3 = 6, heto kexni 6 * 4 = 24 hetoe
                                       //24 * 5 = 120 verjnakan@;

    }


}
