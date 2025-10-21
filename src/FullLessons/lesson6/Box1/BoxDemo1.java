package FullLessons.lesson6.Box1;

public class BoxDemo1 {
    public static void main(String[] args) {

        //animast orinak

        Box mybox1 = new Box(); // klassic obyekt sarkink, gnac obyekt@ heap-i mej qcec
        Box mybox2 = new Box(); // nuyn klassic myam urish ekzemplyar sarkink, eli gnac heap bayc irank vabshe tarber
                                // obyektner en
        double vol;
                                // 1 ekzemplyari meji popoxakannerin znacheniner tvink
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
                               // 2 obyektinneri mejinin hmi.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //1 obyekti meji popoxakanneri het erac gorcoxucyun

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Обьем равен " + vol);

        // 2 obyekti

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("обьем равен " + vol);




    }
}
