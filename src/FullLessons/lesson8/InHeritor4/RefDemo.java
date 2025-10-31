package FullLessons.lesson8.InHeritor4;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxweight = new BoxWeight(3, 10, 2, 1.5); //podklass
        Box plainbox = new Box(); //superklass
        double vol;


        System.out.println();

        vol = boxweight.volume();
        System.out.println("Обьем boxweight равен = " + vol);
        System.out.println("вес = " + boxweight.weight);
        System.out.println();


        System.out.println(plainbox.width + " ogo1");  //tarber obyektner, tarber znacheniner
        System.out.println(boxweight.width + " pgp1");

        plainbox = boxweight;                //hmi erkusne k naen nuyn obyektin hishoxucyan mej,
                                             //nuyn ink@ Box plainbox = new BoxWeight(); aysinqn plainbox ssilken k nae
                                              // Box-tipi popoxakannerin/Box-ic jarangac amenin,
        //                                      hmi k sarkenk BoxWeight obyekt@, bayc plainbox@
                                              // et obyekti mej krna nae menak Box tipi obyektnerin,
                                             // isk boxweight ssilken krna nae ham hor tvyalnerin ham ira

        System.out.println("new");
        System.out.println(plainbox.width + " ogo2");   //stex
        System.out.println(boxweight.width + " pgp2");

        System.out.println("do " + plainbox.width);
        boxweight.newvolume();
        System.out.println("posle " + plainbox.width);



        vol = plainbox.volume();
        System.out.println("Oбъeм plainbox равен " + vol); // kexni

        //System.out.println("Вес plainbox равен " + plainbox.weight); // an var orinak or chi exni


    }
}
