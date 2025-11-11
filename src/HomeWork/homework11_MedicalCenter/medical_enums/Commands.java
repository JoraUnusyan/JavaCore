package HomeWork.homework11_MedicalCenter.medical_enums;
public enum Commands {
    EXIT("0", "Выхода"),
    ADD_DOCTOR("1", "Добавления доктора"),
    SEARCH_DOCTOR_BY_POSITION("2", "поиска доктора по профессии"),
    DELETE_DOCTOR_BY_ID("3", "для удаления доктора по ID"),
    CHANGE_DOCTOR_BY_ID("4", "изменения данных доктора по ID"),
    ADD_PATIENT("5", "Добавления пациента"),
    PRINT_ALL_PATIENTS_BY_DOCTOR("6", "получения списка пациентов конкретного доктора"),
    PRINT_ALL_PATIENTS("7", "получения списка всех пациентов"),
    PRINT_ALL_DOCTORS("8", "Получения списка всех докторов");

    private String Number;
    private String Text;
    Commands(String Number, String Text){
        this.Number = Number;
        this.Text = Text;
    }

    public static void printCommands(){
        for (Commands command : Commands.values()) {
            System.out.println("Нажмите " + command.Number + " Для " + command.Text);
        }
    }

}