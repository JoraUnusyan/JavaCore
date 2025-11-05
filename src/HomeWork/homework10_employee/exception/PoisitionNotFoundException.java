package HomeWork.homework10_employee.exception;

public class PoisitionNotFoundException extends Exception{
    public PoisitionNotFoundException(){
        super("ошибка: Сотрудника на такой должности нет");
    }
}
