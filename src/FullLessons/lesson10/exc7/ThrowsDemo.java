package FullLessons.lesson10.exc7;

public class ThrowsDemo {
    static void thr() throws IllegalAccessError{  //thorws-@ or k dnenk metodic heto  exception-i tipov
                                                  // k nshanake or k zgushacnenk es metod@ kanchoxin, or mer metod@ krna
                                                  // es tipi exception qce, u hmi es metod@ kanchox@ partavore obrabotrka ene
                                                 //et exception@
        System.out.println("В теле метода thr ");
        throw new IllegalAccessError("Демонстрация"); //sik zut sarkink qcink yani brnelenk, uxaki cuyc talu hamar

    }

    public static void main(String[] args) {
        try{
            thr();           //inchxor xostaceleink obrabotka erink
        } catch(IllegalAccessError e){
            System.out.println("Перехвачено исключение " + e);
        }
    }

}
