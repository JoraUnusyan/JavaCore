package classwork.lesson10;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.setDim(10, 20, 15);  // w h d появляються автоматический, не нужно их писать
        myBox2.setDim(3, 6, 9);
        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);
        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
