package classwork.lesson8;

public class menu {
    public static void main(String[] args) throws java.io.IOException {

        // throws java.io.IOException это незнакомый класс который мы пройдем в будущем

        char choice;
        do {
            System.out.println("Օպերատորի օգնություն");
            System.out.println("      1. if");
            System.out.println("      2. switch");
            System.out.println("      3. while");
            System.out.println("      4. do-while");
            System.out.println("      5. for/n");
            System.out.println("Ընտրեք ցանկալի տարրը.");
            choice = (char) System.in.read(); }  // нужно чтобы мы могли выбрать пункт

        while( choice < '1' || choice > '5'); // нужно чтобы если кто-то нажал цифру вне списка, ему снова напечатали
                                              // начальное меню
                System.out.println("/n");

                switch(choice) {
                    case '1':
                        System.out.println("if:/n");
                        System.out.println(("if(պայման) օպերատոր;"));
                        System.out.println("else օպերատոր");
                        break;
                    case '2':
                        System.out.println(("switch:\n"));
                        System.out.println( "switсh(արտահայտություն) {");
                        System.out.println(" case Կոնստանտա:");
                        System.out.println("Օպերատորների հաջորդականությունը");
                        System.out.println(" break;");
                        System.out.println("//...");
                        System.out.println("}");
                        break;
                    case '3':
                        System.out.println("while:/n");
                        System.out.println("while(պայման) Օպերատոր;");
                        break;
                    case '4':
                        System.out.println("do-while:\n");
                        System.out.println("do {");
                        System.out.println(" Օպերատոր; ");
                        System.out.println("} while (պայման);");
                        break;
                    case '5':
                        System.out.println("for:/n");
                        System.out.println("for(սկզբնավորում/պայման/կրկնում)");
                        System.out.println("Օպերատոր");
                        break;

        }
    }
}
