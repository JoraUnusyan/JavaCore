package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        //   1) Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8, 5};
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
        //   2) Տպել մասիվի առաջին էլեմենտը
        System.out.println(numbers[0]);

        System.out.println();
        System.out.println();
        //   3) Տպել մասիվի վերջին էլեմենտը
        System.out.println(numbers.length - 1);

        System.out.println();
        //   4) Տպել մասիվի երկարությունը

        System.out.println(numbers.length);

        //   5) Տպել մասիվի ամենափոքր թիվը
        System.out.println();
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("minimum " + min);

        //   6) Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար էղավ,
        //   տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի էլեմենտների թիվը,
        //   տպեք մեջտեղի երկու էլեմենտները, եթե կենտ է մի հատը։
        System.out.println();


        if (numbers.length <= 2) {

            System.out.println("can't print middle values");


        } else if (numbers.length % 2 == 1) {
            // 0 = четное // -1 = нечетное для отрицательных // 1 = нечетное для положительных

            System.out.println(numbers[numbers.length / 2]);

        } else {
            System.out.println(numbers[(numbers.length / 2) - 1] + ", " + numbers[numbers.length / 2]);
        }
        System.out.println();

//          7) Հաշվել ու տպել մասիվում զույգերի քանակը։
        int x = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                x++;
            }
        }
        System.out.println("զույգ տարրերի քանակը " + x);

        System.out.println();
        //  8) Հաշվել ու տպել մասիվում կենտերի քանակը։

        int y = 0;


        for (int number : numbers) {
            if (number % 2 == 1 || number % 2 == -1) {
                y++;
            }

        }
        System.out.println("կենտ տարրերի քանակը " + y);
        System.out.println();

        //  9) Տպել մասիվում էլեմենտների գումարը։
        int e = 0;
        for (int number : numbers) {
            e += number;
        }
        System.out.println("Բոլոր տարրերի գումարը " + e);

        System.out.println();

        // 10) Տպել մասիվում թվերի միջին թվաբանականը։

        System.out.println("միջին թվաբանականը " + e / numbers.length);

    }
}
