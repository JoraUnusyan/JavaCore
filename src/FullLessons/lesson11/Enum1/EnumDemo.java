package FullLessons.lesson11.Enum1;

import FullLessons.lesson11.Enums.Apple;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap; //Apple-i ssilka sarkink vornor en 5 obyektneric mekin krna nae
        ap = Apple.RedDel;  //es ssilken hmi k nae Apple-i RedDel obyektin
        System.out.println("Значение ap = " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel){
            System.out.println("Переменная ап содержит GoldenDel");
        }

        System.out.println();

        switch(ap){  //switch-ov karelie harmar ogtagorcel es ameninch@
            case Jonathan:
                System.out.println("Сорт Джонатан красный");
                break;
            case GoldenDel:
                System.out.println("Сорт ГолденДел желтый");
                break;
            case RedDel:
                System.out.println("Что-то там");
                break;
            case Winesap:
                System.out.println("Что-то");
                break;
            case Cortland:
                System.out.println("a");
                break;
        }

    }
}
