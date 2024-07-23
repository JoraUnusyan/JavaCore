package classwork.lesson6;

public class Doublecycle {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(x + "." + y + " ");
            }
            System.out.println();
            System.out.println();

        }
        for (int i = 15; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();


        }
        for (int i = 1; i <= 15; i++) {
            for (int j = 15; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        double a = 3.54;
        System.out.println(a % 2);
    }


}
