package HomeWork.homework10_employee;

public class EmployeeStorage {
    private Employee[] emp = new Employee[10];
    private int size = 0;

    public void add(Employee employ){
        if(size == emp.length){
            extend();
        }
        emp[size++] = employ;
    }

    private void extend(){
        Employee[] newemp = new Employee[emp.length + 10];
        System.arraycopy(emp, 0, newemp, 0, size);
        emp = newemp;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(emp[i]);
        }
    }

    public void idsearch(String id){
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(id.toLowerCase().equals(emp[i].getEmplyeeID().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;
            }
            if(stop == false) {
                System.out.println("Сотрудника с таким ID нет");
            }
        }



    }


    public void searchCompanyName(String companyname){
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(companyname.toLowerCase().equals(emp[i].getCompany().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;
            }
            if(stop == false) {
                System.out.println("Сотрудников из этой компании нет в списке");
            }
        }
    }


    public void searchNameSurname(String name, String surname){
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(name.toLowerCase().equals(emp[i].getName().toLowerCase()) && surname.toLowerCase().equals(emp[i].getSurname().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;

                 }
            if(stop == false){
                System.out.println("Сотрудников по такой имени и фамилии нет в списке");
            }
        }
    }

    public void positionsearch(String position){
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(position.toLowerCase().equals(emp[i].getPosition().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;
            }
            if(stop == false){
                System.out.println("Сотрудников на такой должности нет в списке");
            }
        }
    }



}