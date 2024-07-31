package classwork.lesson10;

public class Boxdemo {         //тут у нас будет писаться основной код
    public static void main(String[] args) {
        Box myBox = new Box(); // Когда пишем new Box(), мы как бы создаем новый объект КЛАССА "Box"
        double vol;
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Oбъeм равен " + vol);

    }
}
