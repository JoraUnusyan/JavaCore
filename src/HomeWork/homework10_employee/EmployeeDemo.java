package HomeWork.homework10_employee;

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



    private static void addEmployee(){
        System.out.println("Введите имя сотрудника");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию вашего сотрудника");
        String surname = scanner.nextLine();
        System.out.println("Введите айди вашего сотрудника");
        String id = scanner.nextLine();
        System.out.println("Введите зарплату вашего сотрудника");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите в какой компании работает ваш сотрудник");
        String company = scanner.nextLine();
        System.out.println("Введите на какой должности работает ваш сотрудник");
        String positionEmployee = scanner.nextLine();
        Employee employee = new Employee(name, surname, id, salary, company, positionEmployee);
        storage.add(employee);
    }

    private static void searchById(){
        System.out.println("Введите id сотрудника");
        String id = scanner.nextLine();
        storage.idsearch(id);
    }

    private static void searchNameCompany(){
        System.out.println("Введите имя компании для поиска сотрудников");
        String companyname = scanner.nextLine();
        storage.searchCompanyName(companyname);
    }

    private static void searchName(){
        System.out.println("Введите имя сотрудника");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию вашего сотрудника");
        String surname = scanner.nextLine();
        storage.searchNameSurname(name, surname);
    }

    private static void searchPosition(){
        System.out.println("Введите должность сотрудника");
        String position = scanner.nextLine();
        storage.positionsearch(position);
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
                    searchNameCompany();
                    break;
                case SEARCH_BY_NAME_SURNAME:
                    searchName();
                    break;
                case SEARCH_BY_POSITION:
                    searchPosition();
                    break;
            }
        }



    }
}