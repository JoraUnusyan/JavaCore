package HomeWork.homework10_employee.exception;

public class IdNotFoundException extends Exception{
    public IdNotFoundException() {
        super("Ошибка: Сотрудник с таким ID не найден.");
    }

}
