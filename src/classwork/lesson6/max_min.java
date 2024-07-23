package classwork.lesson6;

public class max_min {
    public static void main(String[] args) {
        int[] num = {5, 6, 11, 19, 12};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("max " + max);


    }
}
