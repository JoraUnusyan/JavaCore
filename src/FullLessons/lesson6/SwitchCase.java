package FullLessons.lesson6;

public class SwitchCase {
    public static void main(String[] args) {

        //switch-case@ harmar alternativae if else-in

        //switch-case@ krna stuke menak havasarucyun "=="

        int month = 4;
        String season;

        switch(month) {  // month grelov kudank te inchi vra bdi man ga, es depkum month popoxakani
                         // kareli e dnel String tip@, primitiv tiper@ baci double, float, boolean
            //                  ,chi kareli dnel masivner,
            case 12:
                case 1:
                case 2:
                season = "зиме";
                break;

                //break-ic heto  inchxor senk else if (month == 3 || month == 4 || month==5) {}
            case 3:
            case 4:
            case 5:
                season = "весне"; //ekav, stukec or 5@ true e, tpec meji grac@
                break; //break greluc heto kod@ arten k kangni

            case 6:
            case 7:
            case 8:
                season = "лету";
                break;

            case 9:
            case 10:
            case 11:
                season = "осени";
                break;

            default: season = "вымешленный месяц";  //default or k grenk k nshanake hakarak depkum ete hechban ch
                                                    // hamnkav gre es artahaytucyun@ ...
                                                    // nmane kodic heto grac else-in sovorakan
        }
        System.out.println("Апрель относится к " + season);










    }
}
