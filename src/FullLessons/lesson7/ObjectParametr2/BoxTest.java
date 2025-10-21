package FullLessons.lesson7.ObjectParametr2;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox = new Box(1,2);
        BoxS mybox2 = new BoxS(10, 50);
        Box mybox3 = new Box(mybox2);

        System.out.println(mybox.width); //skzbnakan obyekt@
        System.out.println(mybox2.width); // erkrord obyekt@
        System.out.println(mybox3.width);  //erord obyekt@, vori kanstruktr@ or stacele 2-i link@, ogtagorcelov ira meji
        //tvyalner@

    }
}
