package HomeWork.homework10_employee.exception;

public class NameNotFoundException extends Exception{
    public NameNotFoundException() {
        super("Ошибка: Сотрудника с таким именем и фамилией нет в списке");
    }
}
