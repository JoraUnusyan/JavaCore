package homework.homework1;



public class ForIfExamples {

    void loopone() {
        int x;
        for (x = 0; x <= 10; x++) {
            System.out.println("x: " + x);

        }
        System.out.println();
    }

    void addition() {
        int y;
        int x;
        y = 0;
        for (x = 0; x <= 100; x++) {
            y = y + x;
        }
        System.out.println("y: " + y);

        System.out.println();

    }
    void reverseorder() {
        for (int x = 50; x >= 0; x--) {
            System.out.println("x: " + x);
        }
        System.out.println();  }

    void oddnumbers() {
        for (int x = 1; x <= 20; x = x + 2) {
        System.out.println("x: " + x );
    }
     }

     void evennumbers() {
         int y = 0;
         for(int x = 0; x < 100; x = x + 2){
             y = y + 1;
         }
         System.out.println(y);

     }


    public static void main(String[] args) {













    }
}
