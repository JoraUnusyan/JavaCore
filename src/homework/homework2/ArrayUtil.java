package homework.homework2;

public class ArrayUtil {
    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8, 5};

    void allNumbers() {

        for (int j : numbers) {
            System.out.print(j + " ");
        }
    }

    void firstNumber() {
        System.out.println(numbers[0]);
    }

    void lastNumber() {
        System.out.println(numbers.length - 1);
    }

    void lengthArray() {
        System.out.println(numbers.length);
    }

    int min() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    void middleValues() {
        if (numbers.length <= 2) {

            System.out.println("can't print middle values");


        } else if (numbers.length % 2 == 1) {
            // 0 = четное // -1 = нечетное для отрицательных // 1 = нечетное для положительных

            System.out.println(numbers[numbers.length / 2]);

        } else {
            System.out.println(numbers[(numbers.length / 2) - 1] + ", " + numbers[numbers.length / 2]);
        }
    }


        int evenNumbers() {
            int x = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    x++;
                }
            }
            return x;
        }
            int oddNumbers() {
                int y = 0;
                for (int number : numbers) {
                    if (number % 2 == 1 || number % 2 == -1) {
                        y++;
                    }

                }
                return y;
    }

    int sum() {
        int e = 0;
        for (int number : numbers) {
            e += number;
        }
        return e;
    }

    double average() {
        int e = 0;
        for (int number : numbers) {
            e += number;
        }
        return (double) e / 2;
    }









}
