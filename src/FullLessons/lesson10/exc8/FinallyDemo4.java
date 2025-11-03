package FullLessons.lesson10.exc8;

public class FinallyDemo4 {
    public static int test() {
        try {
            System.out.println("Выполняем try");
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
            return 0; //guka veradarcnox znachenin steki mej k pahe, heto kerta stukek@ finally unink, ete unink finallyn
                    //kene, nor arten es znachenin return kene
        }
        finally {
            System.out.println("finally сработал перед return");
        }

    }

    public static void main(String[] args) {
        System.out.println("Результат: " + test());
    }
}
