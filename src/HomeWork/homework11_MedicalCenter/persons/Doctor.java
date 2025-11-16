package HomeWork.homework11_MedicalCenter.persons;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Human implements Serializable {
    private String email;
    private String profession;


    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }




}