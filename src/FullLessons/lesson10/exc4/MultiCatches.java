package FullLessons.lesson10.exc4;

public class MultiCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        } catch(ArithmeticException e) {   //es depknele exception muysne het@
            System.out.println("Деление на нуль " + e);
        }                                                        //hmi or kod@ ashxatcnenk, guka araji brnac exception@
                                                               // cuyc kuda, ete 1-in@ chexni (xoski args-in banm tank)
                                                             // guka muysin, nor arten muys@ k brne
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации за пределами " + "Массива: " + e);
        }
        System.out.println("После catch-овая");
    }
}
