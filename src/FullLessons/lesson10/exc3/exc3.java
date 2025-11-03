package FullLessons.lesson10.exc3;

public class exc3 {
    public static void main(String[] args) {
        int d, a;
        try{
            d = 0;
            a = 42/d; //es pahin try-i meji kod@ kangnink@, kerta catch-ov k brne Exception@, abrabotka kenenk, itogum k
                      //kod@ el chi kangni kerta araj, selov or stex 0-i es bajne ay vochxar
            System.out.println("это не будет выведено");
        } catch(ArithmeticException e){                   //spes bani hamar hechmart try catch irakan proektneri mej
                                                           // chi ene
            System.out.println("Деление на ноль");
        }
        System.out.println("после catch");

    }
}
