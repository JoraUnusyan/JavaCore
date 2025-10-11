package FullLessons.lesson6;

public class SwitchCase_For {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {

            switch (numbers[i]) {              // switch case-@ karelie ogtagorcel masivneri het es formatov
                                               // bayc uxaki "numbers" mej@ dnel cher exni, bayc fori-i mijocov karelie
                                               // hertov stukel meji tver@, qani or switch case-@ krna menak me hatm
                                               // konkret bani havasarucyun stukel
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("...");
            }
        }




    }


}
