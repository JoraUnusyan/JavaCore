package classwork.lesson3;

public class IfSample {

    public static void main(String[] args) {

        int x, y;
        boolean b = true;

        x = 20;
        y = 40;

        if (x < y) {
            System.out.println("x փոքր է y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x հիմա հավասար է y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x մեծ է y");
        }
    }
}