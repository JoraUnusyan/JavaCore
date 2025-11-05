package HomeWork.homework10_employee.exception;

public class IdDuplicateException extends Exception{
    public IdDuplicateException(){
        super("Ошибка: Сотрудник с таким ID уже существует");
    }

}
