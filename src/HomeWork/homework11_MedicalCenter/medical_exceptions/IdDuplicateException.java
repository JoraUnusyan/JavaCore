package HomeWork.homework11_MedicalCenter.medical_exceptions;

public class IdDuplicateException extends RuntimeException {
    public IdDuplicateException(){
        super("Ошибка: Персона с таким ID уже существует");
    }
}