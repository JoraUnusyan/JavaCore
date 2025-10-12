package FullLessons.lesson5;

public class Menu_DoWhile {
    public static void main(String[] args)
            throws java.io.IOException  { // petke system.in.read(); ogtagorcelu hamar, aveli xor@ imanal
    // l@ petk che, heto kancnink.


        //do while-@ skzbic me ankam kod@ kene, heto nor k stuke payman@.
        // daj@ ete false exni, meke araji ankam@ kexni, araji ankamic heto ete false ta arten k kangni.
        // petke ay spes depkerum orinak:

    char choice;
    do{
        System.out.println("Cпpaвкa по оператору:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. while");
        System.out.println(" 4. do-while");
        System.out.println(" 5. for\n");
        System.out.println("Bыбepитe нужный пункт:");
        choice = (char) System.in.read(); }    // konsoli mej mer grac@ char k sarke u k pahe choice-i mej
                                               // chenk dne int vortev biterov vabshe urish tiv k sarke, aveli heshte
                                               // charerov

         while(choice < '1' || choice > '5');  //ete 0 kam 1 k grenk, nor true kexni u tekst@ mezi taza kuda, minchev or
        // menk ch grenk tiv vornor @ngac e 0-i u 5-i mej, et vaxt kuda false, el cikl@ chi ashxati, choice-@ k stana
        // petkakan tiv@, kashxati switch-case@ u menk k stanank ira meji grac@

        //stex while@ k haskna '1` ic minchev `5`-@ vortev `1`-@ tverov pahac 49@-n e, `2`-@ - 50, `3`-51 ev ayln

        System.out.println("\n");

        switch(choice) {  //
        case '1' :
        System.out .println ( "if: \n");
        System.out.println("if(ycлoвиe) оператор;");
        System.out.println("else оператор;");
        break;
        case '2' :
        System.out.println("switch:\n");
        System.out .println( "switсh(выражение) {");
        System.out.println(" case константа:");
        System.out.println(
                " последовательность операторов");
        System.out.println(" break;");
        System. out .println (" / / ... ");
        System.out.println("}");
        break;
        case '3' :
        System.out.println("while:\n");
        System.out.println("while(ycлoвиe) оператор;");
        break;
        case '4' :
        System.out.println("do-while:\n");
        System.out.println("do {");
        System.out.println(" оператор;");
        System.out.println("} while (условие);");

        break;
        case '5' :
        System.out.println("for:\n");
        System.out.print("for(инициaлизaция; условие; итерация)");
        System.out.println(" оператор;");
        break; }






    }
}
