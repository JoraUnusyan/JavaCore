package classwork.lesson9;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Дo возврата.");
        if (t) return;  //тут метод должен был закончиться, но так как кроме маин пока ничего и не нету, вся программа
                        // по сути просто заканчиваеться
        System.out.println("Этот оператор выполняться не будет");
    }
}
