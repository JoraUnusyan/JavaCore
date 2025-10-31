package FullLessons.lesson8.ObjectClass.getClass;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Jora");
        String text = "Hello";

        Class<?> personG = person.getClass(); // Class<?> person6 - @dik popoxakan e, urdex or tvelenk or krna mej pahe
                                              //Class<?> aysinqn lyuboy class (anhayt enk tve "?" dnelov, ink@ inche tas
                                             //k pahe mej@

        //isk getClass() metod@ gtnik@ te konkret inch klasin k verabervi obyekt@
        Class<?> stringG = text.getClass();

        System.out.println("person это " + personG.getName());       //getName-@ klassi anun@ u hascen k bere kuda
                                                                    //hasceyov banov inch gtav hertov gnac minchev
                                                                   // Person-in hasav
        System.out.println("text это " + stringG.getName());

        if (personG == Person.class) {                         //bnakanabar havasaren, nuyn klassne
            System.out.println("Класс совпадает");
        }

        if (stringG == String.class) {
            System.out.println("Класс совпадает");
        }

        Class<?> c;  //krnank uxaki popoxakan@ sarkenk vori mej lyuboy klassi opisanya (Class obyekt@ MetaSpace-ic, ch xarnel
                                              //klassi ekzemplyari het) karelie pahel, aveli chisht ssilken @dur vra

        c = Person.class;  //heto krnank mej@ meankamic es dzev pahenk mer uzac class@
        System.out.println("c указывает на " + c.getName());


        c = String.class;
        System.out.println("а щас указывает на " + c.getName());


        if (person instanceof Person) {
            System.out.println("person это Person");
        }

        if (text instanceof String) {
            System.out.println("text принодлежит к String");
        }



    }
}
