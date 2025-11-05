package FullLessons.lesson11.Enum2;

import FullLessons.lesson11.Enums.Apple;

public class EnumDemo2_Value {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечисляемого типа Apple: ");
        Apple allapples[] = Apple.values();  //values()-metod@ k ogtagorcvi or mer Apple enum-i obyektner@ brnenk myam masivi
                                            //teskov pahenk
        for (Apple a : allapples) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");  //ValueOf-n e kerta stukek@ ka arcyok @dpes anunov konstant, ete ha kerta
                                            //et anuni tak@ @ngac veradarcnek@, ete chka - exception k qce
        System.out.println("Переменная ap содержит " + ap);
    }
}
