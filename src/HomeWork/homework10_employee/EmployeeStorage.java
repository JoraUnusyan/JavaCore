package HomeWork.homework10_employee;

import HomeWork.homework10_employee.enums.PositionLevel;
import HomeWork.homework10_employee.exception.*;

public class EmployeeStorage {
    private Employee[] emp = new Employee[10];
    private int size = 0;

    public void add(Employee employ) throws IdDuplicateException {
        for (int i = 0; i < size; i++) {
            if(emp[i].getEmplyeeID().toLowerCase().equals(employ.getEmplyeeID().toLowerCase())) {
                throw new IdDuplicateException();
            }
        }
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

    public void searchById(String id) throws IdNotFoundException {
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(id.toLowerCase().equals(emp[i].getEmplyeeID().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;
            }
        }
        if(!stop) {
             throw new IdNotFoundException();
        }

    }


    public void searchByCompanyName(String companyname) throws CompanyNotFoundException {
        boolean stop = false;
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if(companyname.toLowerCase().equals(emp[i].getCompany().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;
            }
        }



        if(!stop) {
                throw new CompanyNotFoundException();
        }
    }


    public void searchByNameAndSurname(String name, String surname) throws NameNotFoundException {
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(name.toLowerCase().equals(emp[i].getName().toLowerCase()) && surname.toLowerCase().equals(emp[i].getSurname().toLowerCase())){
                System.out.println(emp[i]);
                stop = true;}}

        if(!stop){
                throw new NameNotFoundException();
        }
    }

    public void searchByPosition(PositionLevel position) throws PoisitionNotFoundException {
        boolean stop = false;
        for (int i = 0; i < size; i++) {
            if(position == emp[i].getPosition()){
                System.out.println(emp[i]);
                stop = true;
            }

        }
        if(!stop){
                throw new PoisitionNotFoundException();
        }
    }



}