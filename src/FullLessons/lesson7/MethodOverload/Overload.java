package FullLessons.lesson7.MethodOverload;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo over = new OverloadDemo();

        //kancheluc argumentner@ or kudank, arten k haskna vor konkret metodin k verabervi
        // ete xoski unink 1 double parametrov metod, u argument@ kudank 10.1 ink@ k haska or et tarberakin k verabervi

        over.test(); // aranc parametri
        over.test(10); //me int parametr
        over.test(10, 20);  //erku int parametr
        over.test(10.1);  //double parametrov@
        double ovtest = over.test(10.2);
        System.out.println(ovtest);


    }
}
