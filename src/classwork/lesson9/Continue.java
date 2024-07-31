package classwork.lesson9;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;    // Если число будет четным, цикл продолжиться, если не четным - кинет на новую
                                       // строку
            System.out.println("");

            
        }
    }
}
