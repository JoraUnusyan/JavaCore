package FullLessons.lesson10.exc11;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1, 2, 3};
        try{
            int result = a / b;
            vals[10] = 19;
        } catch(ArrayIndexOutOfBoundsException | ArithmeticException e){  //vochmi nor ban uxaki karelie spes grel 100 hat
                                                                           //catcheri tex@
            System.out.println("Перехвачено исключение " + e);
        }
        System.out.println("после перехватов ");
    }
}
