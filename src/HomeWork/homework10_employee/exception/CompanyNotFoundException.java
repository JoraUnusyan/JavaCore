package HomeWork.homework10_employee.exception;

public class CompanyNotFoundException extends Exception{
    public CompanyNotFoundException(){
        super("Ошибка: Сотрудников из этой компании нет");
    }
}
