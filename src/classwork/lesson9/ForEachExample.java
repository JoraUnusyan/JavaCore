package classwork.lesson9;

public class ForEachExample {
    public static void main(String[] args) {
        int [] array = {4, 7, 9, 2, 1, 7};
        int sum = 0;
        for (int i : array) {  // Можно написать iter и " for (int i : array) " - появиться в готовом виде
            sum += i; }
        System.out.println(sum);
        // если массивов несколько, можно написать имя массива и после iter (array.iter)
        // чтобы выбрать конкретный массив

    }
}
