package FullLessons.lesson7.ObjectReturn5;

public class Demo {
    public static void main(String[] args) {

        Box b1 = new Box(2, 3);
        Container c = new Container(b1); //sarkink konteyner vorov or b1-obyekt@ pahink mej@
        Box retrived = c.getBox(); //berav retrived-i mej return erav mer box obyekt@, vor@ or nuyn b1-n er,
        //vorne or paheleink container-i mej, isk container-i mej staceler box anun@, hmi et nuyn link@ poxancink
        //retrived-in


        retrived.show(); //exav nuyn 2 u 3-@ vornor tvelenk b1-in vortev b1-ic l@ banov chi tarbervi

        retrived.grow(); //grow metod@ kanchink, vornor prost@ x2 erav mer tver@
        retrived.show(); // hmi arten 4 u 6 e

        b1.show(); // b1-i meje poxvav darav 4 u 6, vortev menk prost@ ira link@ krugov k poxanceink


        Box copy = c.copybox(retrived);  // es tarberakov stacank kopyan inchor popoxvac banerov
        copy.show();

        retrived.show(); //bayc original@ ch poxvav
    }
}
