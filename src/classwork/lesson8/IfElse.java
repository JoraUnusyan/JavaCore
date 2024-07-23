package classwork.lesson8;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;

        // каждый раз надо делать else if, чтобы программа перестала читать дальше, если нашла
        // верный ответ, и сразу переместилась на строку с распечатыванием текста

        if (month == 12 || month == 1 || month == 2) {
            season = "Ձմեռ";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "գարուն";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "ամառ";
        } else if (month == 9 || month == 10 || month == 11) {

            season = "աշուն";
        } else {
            season = "գոյություն չունի";
        }

        System.out.println("Ապրիլը վերաբերում է " + season + ".");



}

}
