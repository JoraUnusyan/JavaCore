package FullLessons.lesson10.exc6;

public class ThrowDemo {
    static void demoproc(){

        //sovorakan try catch-i vaxt java-n avtomat sarker@ exception-i obyekt@ inchor sxali depkum u xrkerk@, bayc
        // kan depker@ ep or menk andzamp guzenk sarkenk qcenk, orinak inchor bane gre polzovatel@ vornor
        // java-n sxal chi hamare bayc menk sxal k hamarenk, u mezi petke or et depkum exception ta
        // henc et depkeri hamaren throw-ner@



        try{  //throw-@ operatore vornor mer sarkac exception-i obyekt@ meankamic kuda motaka catch-in u
              // k kangncne try-i meji mnacac kod@

            throw new NullPointerException("Демонстрация"); //sarkink obyekt NullPointerException tipov, u dem@ or throw
            //grink ink@ meankamic mnacac kod@ kangncrec u xrkec exception@ motaka catch-in

            // + krnank mer sabshenin dnenk vornor k tesnin (ink@ getMessage uni nayev)


        } catch(NullPointerException e){ //k @ndune NullPointerException tipi obyekt(epor throw-@ en obyekt@ xrkec motaka catch-in
            //es catch@ k brne et obyekt@, u e popoxakanov iran krnan obrasheni tank
            System.out.println("Исключено перехвачено в теле " + "Метода demoproc()");
            throw e;  //ed nuyn exceptioni obyekt@ eli xrkink motaka catch-in (aysinqn en metodi catch-in voric or k kanchenk es metod@)

        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e) {
            System.out.println("повторный перехват " + e);
        }
    }
}
