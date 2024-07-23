package classwork.lesson8;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:  //после case ставить не ; а : (после default тоже : ибо это не операторы)
            case 1:
            case 2:
                season = "Ձմեռ";
                break;  //обязательно после добавлять break
            case 3:
            case 4:
            case 5:
                season = "գարուն";
                break;
            case 6:
            case 7:
            case 8:
                season = "ամառ";
                        break;
            case 9:
            case 10:
            case 11:
                season = "աշուն";
                        break;
            default: //default тут нужен чтобы отметить, что если никакой из цифр нет, надо значит писать это:
                season = "գոյություն չունի"; }

            System.out.println("ապրիլը վերաբերում է " + season);

    }
}
