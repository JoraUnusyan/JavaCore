package classwork.lesson9;

public class Search {
    public static void main(String[] args) {
        int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;

            }
        }
        if (found = true)
            System.out.println("Знaчeниe найдено!");
        else
            System.out.println("Ты дурак? нет тут такой цифры");

    }
}
