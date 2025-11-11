package HomeWork.homework10_employee;

import HomeWork.homework10_employee.exception.*;
import HomeWork.homework10_employee.enums.PositionLevel;

import java.util.Scanner;

public class EmployeeDemo {

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL = "2";
    private static final String SEARCH_BY_ID = "3";
    private static final String EMPLOYEE_BY_COMPANY_NAME = "4";
    private static final String SEARCH_BY_NAME_SURNAME = "5";
    private static final String SEARCH_BY_POSITION = "6";

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage storage = new EmployeeStorage();



    private static void addEmployee() {
        System.out.println("Введите имя сотрудника");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию вашего сотрудника");
        String surname = scanner.nextLine();
        System.out.println("Введите айди вашего сотрудника");
        String id = scanner.nextLine();
        System.out.println("Введите зарплату вашего сотрудника");
        String salary = scanner.nextLine();
        System.out.println("Введите в какой компании работает ваш сотрудник");
        String company = scanner.nextLine();
        System.out.println("Выберите PositionLevel вашего сотрудника");
        PositionLevel[] save = PositionLevel.values();
        for (int i = 0; i < save.length; i++) {
            System.out.println(i + ": " + save[i]);
        }
        int lvl;
        try{
            lvl = Integer.parseInt(scanner.nextLine());
            if (lvl < 0 || lvl >= save.length) {
                throw new ArithmeticException();
            }
        } catch(ArithmeticException e)  {
            System.out.println("Ошибка: Такой должности не существует");
            return;
        }
        PositionLevel position = save[lvl];
        Employee employee = new Employee(name, surname, id, salary, company, position);
        try {
            storage.add(employee);
        } catch (IdDuplicateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchById(){
        System.out.println("Введите id сотрудника");
        String id = scanner.nextLine();
        try {
            storage.searchById(id);
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchByCompanyName(){
        System.out.println("Введите имя компании для поиска сотрудников");
        String companyname = scanner.nextLine();
        try {
            storage.searchByCompanyName(companyname);
        } catch (CompanyNotFoundException e) {
            System.out.println(e.getMessage());

        }
    }

    private static void searchByNameAndUsername (){
        System.out.println("Введите имя сотрудника");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию вашего сотрудника");
        String surname = scanner.nextLine();
        try {
            storage.searchByNameAndSurname(name, surname);
        } catch (NameNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchByPosition(){
        System.out.println("Выберите должность для поиска:");
        PositionLevel[] levels = PositionLevel.values();
        for (int i = 0; i < levels.length; i++) {
            System.out.println(i + ": " + levels[i]);
        }

        int lvl;
        try {
            lvl = Integer.parseInt(scanner.nextLine());
            if (lvl < 0 || lvl >= levels.length) {
                System.out.println("Ошибка! Такой должности нет.");
            }
            PositionLevel position = levels[lvl];
            storage.searchByPosition(position);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Нужно ввести число.");
        } catch (PoisitionNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void commands(){
        System.out.println("Пожалуйста нажмите " + EXIT + " Чтобы закрыть программу");
        System.out.println("Пожалуйста нажмите " + ADD_EMPLOYEE + " Чтобы ввести данные нового сотрудника");
        System.out.println("Пожалуйста нажмите " + PRINT_ALL + " Чтобы распечатать всех сотрудников");
        System.out.println("Пожалуйста нажмите " + SEARCH_BY_ID + " Чтобы найти сотрудника по ID");
        System.out.println("Пожалуйста нажмите " + EMPLOYEE_BY_COMPANY_NAME + " Чтобы найти сотрудника по названию компании");
        System.out.println("Пожалуйста нажмите " + SEARCH_BY_NAME_SURNAME + " Чтобы найти сотрудника по имени и фамилии");
        System.out.println("Пожалуйста нажмите " + SEARCH_BY_POSITION + " Чтобы найти сотрудника по его должности");

    }


    public static void main(String[] args) {
        boolean start = true;

        while(start){
            commands();
            String command = scanner.nextLine();
            switch(command){
                case EXIT:
                    start = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL:
                    storage.print();
                    break;
                case SEARCH_BY_ID:
                    searchById();
                    break;
                case EMPLOYEE_BY_COMPANY_NAME:
                    searchByCompanyName();
                    break;
                case SEARCH_BY_NAME_SURNAME:
                    searchByNameAndUsername();
                    break;
                case SEARCH_BY_POSITION:
                    searchByPosition();
                    break;
            }}}}