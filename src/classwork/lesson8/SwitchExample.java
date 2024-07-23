package classwork.lesson8;

public class SwitchExample {
    public static void main(String[] args) {
        String language = "Հայերեն"; // Все тоже самое что и в примере Switch
        switch(language) {
            case "Հայերեն":
                System.out.println("Բարեւ");
                break;
            case "Русский":
                System.out.println("Привет");
                break;
            case "English":
                System.out.println("Hello");
                break;
            default: // не забывать после default тоже ставить ":"
                    System.out.println("Unsupported language");
        }
    }
}

