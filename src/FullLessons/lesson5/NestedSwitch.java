package FullLessons.lesson5;

public class NestedSwitch {

    public static void main(String[] args) {
        int count = 1;
        int target = 2;

        switch(count){         //ira logikayov nmane if-in if-i mej.
            case 1:
                switch(target) {
                    case 2:
                        System.out.println("правильно");
                }
        }
    }




}
