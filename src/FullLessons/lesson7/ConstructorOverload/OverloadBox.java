package FullLessons.lesson7.ConstructorOverload;

public class OverloadBox {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box(10, 20, 30);
        Box mybox3 = new Box(10);   //krnank hmi sarkenk tarber skzbnakan parametrerov ekzemplyarner

        double vol = mybox1.volume();
        System.out.println(vol);

        double vol2 = mybox2.volume();
        System.out.println(vol2);

        double vol3 = mybox3.volume();
        System.out.println(vol3);





    }
}
