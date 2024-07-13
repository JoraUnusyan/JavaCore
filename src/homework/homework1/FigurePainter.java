package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < x + 1; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        for (int x = 5; x >= 0; x--) {
            for (int y = 0; y < x; y++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int x = 1; x <= 5; x++) {
            for (int y = 5; y > x; y--) {
                System.out.print("  ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 5; x > 0; x--) {
            for (int y = 5; y > x; y--) {
                System.out.print("  ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 1; x <= 5; x++) {
            for (int y = 5; y > x; y--) {
                System.out.print(" ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = 4; x > 0; x--) {
            for (int y = 5; y > x; y--) {
                System.out.print(" ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}