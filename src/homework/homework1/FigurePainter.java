package homework.homework1;

public class FigurePainter {

    void figure0ne() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < x + 1; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    void figuretwo() {
        for (int x = 5; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    void figurtree() {
        for (int x = 0; x <= 5; x++) {
            for (int y = 5; y > x; y--) {
                System.out.print("  ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void figurefour() {
        for (int x = 5; x > 0; x--) {
            for (int y = 5; y > x; y--) {
                System.out.print("  ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    void figurefive() {
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


