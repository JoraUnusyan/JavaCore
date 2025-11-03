package FullLessons.lesson10.exc8;

public class FinallyDemo {
    public static void main(String[] args) {   //finnaly-n @dik kodi bloke vornor misht kashxati, ankax @nuric
                                                // exception brnele te che
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Результат " + c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: нельзя на ноль делить");
        } finally {  //ham sxal@ brnec, ham finally-bloK@ ashxatcrec
            System.out.println("Блок finally был задействован");
        }
    }
}
