package classwork.lesson9;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("ПРОХОД " + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;                // break outer = завершить оба цикла
                System.out.print(j + " ");
                
            }
            System.out.println("Это строкап не будет выводиться");
            
        }
        System.out.println("циклы завершены");
    }
}
