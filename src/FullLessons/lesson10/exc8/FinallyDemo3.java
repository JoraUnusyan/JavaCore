package FullLessons.lesson10.exc8;

public class FinallyDemo3 {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[10]); // daj@ aranc catch karelie spes enel
        } finally {
            System.out.println("finally всё равно сработал"); //u finally-n meke kashxati
        }
    }
}
