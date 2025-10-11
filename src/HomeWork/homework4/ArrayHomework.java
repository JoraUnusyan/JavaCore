package HomeWork.homework4;

public class ArrayHomework {
    public static void main(String[] args) {
        int array[] = {1, 6, 3, 9, 5, -1, 50, 40, 6, 2};

        //1)

        int n = 6;
        int num = 0;
        for (int a : array) {
            if (a == n) {
                num++;
            }
        }
        System.out.println("Number n in array = " + num);

        System.out.println();

        //2)

        for (int i = 0; i < array.length / 2; i++) {
            int number_i = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = number_i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        System.out.println();
        // 3)

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    summ++;
                }
            }


        }
        System.out.println("summ = " + summ);

        System.out.println();

        //4

        char[] simvols = {'ա', 'ե', 'ը', 'ի', 'օ', 'ո'};

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int charsum = 0;
        for (int i = 0; i < simvols.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (simvols[i] == chars[j]) {
                    charsum++;
                }
            }
        }
        System.out.println("chars sum = " + charsum);

    }
}
