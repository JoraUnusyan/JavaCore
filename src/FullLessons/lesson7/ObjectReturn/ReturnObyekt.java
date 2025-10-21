package FullLessons.lesson7.ObjectReturn;

public class ReturnObyekt {
    public static void main(String[] args) {
        Obyekt b1 = new Obyekt(2, 3);
        Obyekt b2 = b1.Doublemethod();  //metod@ kanchink Obyekt b2 ssilki mej, hmi mer metodi mej sarkac obyekt@ guka
        // k pahpanvi ira mej
        System.out.println(b2.width + " x " +  b2.height);
    }
}
