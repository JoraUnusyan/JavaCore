package HomeWork.homework11_MedicalCenter.persons;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Patient extends Human implements Serializable {
    private Doctor doctor;
    private LocalDate registerDateTime;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, LocalDate registerDateTime) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDate registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient pacient = (Patient) o;
        return Objects.equals(doctor, pacient.doctor) && Objects.equals(registerDateTime, pacient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}