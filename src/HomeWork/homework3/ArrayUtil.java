package HomeWork.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //     1)
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println();

        // 2)

        System.out.println("start index = " + numbers[0]);


        System.out.println();

        //3)

        System.out.println("end index = " + numbers[numbers.length-1]);

        System.out.println();

        //4)

        System.out.println("massive length = " + numbers.length);

        System.out.println();

        //5)

        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < x ) {
                x = numbers[i];
            }

        }System.out.println("min index = " + x);

        System.out.println();

        //6)


        if(numbers.length > 2) {
            if(numbers.length % 2 == 0) {
                System.out.println("middle number = " + (numbers[numbers.length/2]) + " " + (numbers[numbers.length/2 - 1]));
            }
            else if(numbers.length % 2 != 0) {
                System.out.println("middle number = " + (numbers[numbers.length/2]));
            }
        }
        else{
            System.out.println("can't print middle values");
        }

        System.out.println();

        //7) + 8)
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                a++;
            }
            else {
                b++;
            }
        }
        System.out.println("number of odd numbers = " + a);
        System.out.println("number of even numbers = " + b);

        System.out.println();


        // 9

        int summ = 0;
        for (int i = 0; i < numbers.length; i++) {
            summ += numbers[i];
        }
        System.out.println("sum of elements = " + summ);

        System.out.println();

        // 10)

        double midlenumbers = (double) summ /numbers.length;
        System.out.println("middle summ = " + midlenumbers);





    }
}
