package HomeWork.homework10_employee;

import HomeWork.homework10_employee.Enums.PositionLevel;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String emplyeeID;
    private String salary;
    private String company;
    private PositionLevel positionlvl;

    public Employee(String name, String surname, String emplyeeID, String salary, String company, PositionLevel position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.salary = salary;
        this.company = company;
        this.positionlvl = position;
    }

    public Employee(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PositionLevel getPosition() {
        return positionlvl;
    }

    public void setPosition(PositionLevel position) {
        this.positionlvl = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(emplyeeID, employee.emplyeeID) && Objects.equals(company, employee.company) && Objects.equals(positionlvl, employee.positionlvl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, emplyeeID, salary, company, positionlvl);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + positionlvl + '\'' +
                '}';
    }
}