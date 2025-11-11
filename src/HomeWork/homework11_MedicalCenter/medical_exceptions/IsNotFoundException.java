package HomeWork.homework11_MedicalCenter.medical_exceptions;


public class IsNotFoundException extends RuntimeException {
    public IsNotFoundException(){
        super("Ошибка: запрашиваемые данные отсувствуют");
    }
}