package classwork.lesson9;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; {               // Если i == 10, значит цикл должен отрубиться
                System.out.println("I " + i);
            }
        }
        System.out.println("цикл завершен");
    }
}
