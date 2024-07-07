package homework.homework1;


public class ForIfExamples {
    public static void main(String[] args) {
        int x;
        for (x = 0; x <= 10; x++) {
            System.out.println("x: " + x);

        }

        int y;
        y = 0;
        for (x = 0; x <= 100; x++) {
            y = y + x;
        }
        System.out.println("y: " + y);

        for (x = 50; x >= 0; x--) {
            System.out.println("x: " + x);
        }

        for (x = 1; x <= 20; x = x + 2) {
            System.out.println("x: " + x );
        }

        y = 0;
        for(x = 0; x < 100; x = x + 2){
            y = y + 1;
        }
        System.out.println(y);




    }
}
