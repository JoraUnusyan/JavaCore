package FullLessons.lesson8.InHeritor5;

public class Test {
    public static void main(String[] args) {
        Shipment sh1 = new Shipment(3, 10, 15, 10, 25);
        Shipment sh2 = new Shipment(2, 3, 4, 3.5, 2.7);
        double vol;
        vol = sh1.volume();
        System.out.println("volume of shipment 1 " + vol);
        System.out.println("weight of sh1 " + sh1.weight);
    }
}
