package FullLessons.lesson8.Inheritor1;

public class InheritorTest {
    public static void main(String[] args) {
    A superObj = new A();
    B subObj = new B();  //sarkvik@ obyekt heap-i mej vornor ira hertin uni classi-i ssilken MetaSpace-i mej, vorne ira
                         // hertin
                         // cnox klassin (A)-in k hxvi, kerta k haskna inchkan hishoxucyun ta heap-in et ameninchi hamar,
                         // nor guka obyekt@ et hishoxucyan chapov k stexce.

    superObj.showij();


    superObj.i = 10;
    superObj.j = 20;
        System.out.print("содержимое А = ");
        superObj.showij();
        subObj.sum(); //k stanank 0, vortev superObj-i znacheniner@ chi poxancvi Subobj-in

        subObj.i = 8;
        subObj.j = 3;
        subObj.k = 4;
      //  superObj.showij(); //ira mejinin@ ch poxvav, sik zut SubObj-n en

        subObj.sum();


    }
}
