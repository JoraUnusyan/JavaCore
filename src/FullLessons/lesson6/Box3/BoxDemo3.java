package FullLessons.lesson6.Box3;

import FullLessons.lesson6.Box2.Box2;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();  //return-@ k veradarcne arcyunk@ @Ndex urdic or kanchelen, es depkum kanchink
        //u pahink vol popoxakani mej, ete vol popoxakan@ double chexner ayl String, menk kompilyacyai oshibka k
        //brneink, tarber tiper chi kareli enel.
        // chnayac double-ic karelie int stanal ete KAST enel int vol = (int) mybox1.volume();
        System.out.println("обьем равен " + vol);

        vol = mybox2.volume();
        System.out.println("обьем равен " + vol);

    }
}
