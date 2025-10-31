package FullLessons.lesson8.InHeritor3;

public class Demo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(3, 5, 10, 3.4);
        BoxWeight mybox2 = new BoxWeight(11, 23, 13, 16.5);
        double vol;

        vol = mybox1.volume(); //mer hor metod@ ogtagorcink jarangi hamar
        System.out.println("Результат = " + vol);
        System.out.println("вес = " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Результат = " + vol);
        System.out.println("вес = " + mybox2.weight);

}}
