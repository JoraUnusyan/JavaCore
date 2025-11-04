package FullLessons.lesson10.exc10;

public class ChainExcDemo {
    static void demoproc() {
    NullPointerException e = new NullPointerException();
    e.initCause(new ArithmeticException("пpичинa")); //kapink irar het, inchxor senk or e-n hetevanqne, new ArithmeticException-@
                                                     // patcharne
    throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch(NullPointerException e){
            System.out.println("Перехвачено исключение " + e);
            System.out.println("Первопричина " + e.getCause()); //getCause-ov e krnank arten tesnink te over patchar@, ayl vochte hetevank@
        }
    }
}


