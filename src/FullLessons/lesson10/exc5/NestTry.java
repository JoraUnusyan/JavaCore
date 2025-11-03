package FullLessons.lesson10.exc5;

public class NestTry {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            try {
                int result = numbers[0] / 0;
                System.out.println("Результат " + result);        //krnank @mpes enenk or logikayi inchor mas nerqin@ stuke
            } catch (ArithmeticException e) {
                System.out.println("Внутренний catch =  Было сделано '/' на ноль");
            }

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Внешний catch = индекс за пределами массива"); //inchor bane glxavor@ stuke
        }

        //ahakin k ogne me qanim ban meankamic stukel, isk glxavor oshibken toxnel or glxavor@ stuke

        System.out.println("после cath");
    }
}
