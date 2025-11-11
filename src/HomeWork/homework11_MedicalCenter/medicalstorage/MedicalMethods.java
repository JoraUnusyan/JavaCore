package HomeWork.homework11_MedicalCenter.medicalstorage;

import HomeWork.homework11_MedicalCenter.persons.Doctor;
import HomeWork.homework11_MedicalCenter.persons.Patient;

public interface MedicalMethods {
    void addDoctor(Doctor doc);
    void searchDoctorByProfession(String profession);
    void deleteDoctorById(String id);
    void changeDoctorById(String id, String name, String surname, String phoneNumber, String email, String profession);
    void printAllPatientsByDoctor(String id);
    void addPatient(Patient p);
    void printAllPatients();
}
