package FullLessons.lesson6.Box2;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();  //1 ekzemplyari metod@
        mybox2.volume();  //2 ekzemplyari metod@

    }
}
