package FullLessons.lesson10.exc8;

public class FinallyDemo2 {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 2;
            int result = x / y;
            System.out.println("Результат " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка։ нельзя делить на ноль!");  //sxal chkar, catch hechban ch brnec
        } finally {
            System.out.println("finally выполнена"); //bayc finally meke kashxati
        }
    }
}
