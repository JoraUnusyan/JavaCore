package HomeWork.homework11_MedicalCenter.medicalstorage;

import HomeWork.homework11_MedicalCenter.medical_exceptions.IdDuplicateException;
import HomeWork.homework11_MedicalCenter.medical_exceptions.IsNotFoundException;
import HomeWork.homework11_MedicalCenter.persons.Doctor;
import HomeWork.homework11_MedicalCenter.persons.Patient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MedicalCenterStorage implements MedicalMethods{

    private Doctor[] doctor =  new Doctor[20];
    private Patient[] patient = new Patient[20];
    private int patSize = 0;
    private int docSize = 0;

    public void addDoctor(Doctor doc) throws IdDuplicateException {
        for (int i = 0; i < docSize; i++) {
            if(doctor[i].getId().toLowerCase().equals(doc.getId().toLowerCase())){
                throw new IdDuplicateException();
            }
        }
        if(docSize == doctor.length){
            extendDoc();
        }
        doctor[docSize++] =  doc;
    }


    public void addPatient(Patient p){
        if(patSize == patient.length){
            extendPat();
        }
        patient[patSize++] =  p;
    }

    private void extendDoc(){
        Doctor[] doc2 = new Doctor[doctor.length + 10];
        System.arraycopy(doctor, 0, doc2, 0, doctor.length);
        doctor = doc2;
    }

    private void extendPat(){
        Patient[] patient2 = new Patient[patient.length + 10];
        System.arraycopy(patient, 0, patient2, 0, patient.length);
        patient = patient2;
    }

    public void searchDoctorByProfession(String profession) throws IsNotFoundException {
        boolean isRun = false;
        for (int i = 0; i < docSize; i++) {
            if(doctor[i].getProfession().toLowerCase().equals(profession.toLowerCase())){
                isRun = true;
                System.out.println(doctor[i]);
            }
        }
        if(!isRun){
            throw new IsNotFoundException();
        }
    }

    public void deleteDoctorById(String id) throws IsNotFoundException{
        boolean isRun = false;
        for (int i = 0; i < docSize; i++) {
            if(doctor[i].getId().toLowerCase().equals(id.toLowerCase())){
                isRun = true;
                for (int j = i; j < docSize-1; j++) {
                    doctor[j] = doctor[j+1];
                }
                docSize--;
            }

        }
        if(!isRun){
            throw new IsNotFoundException();
        }
    }

    public void changeDoctorById(String id, String name, String surname, String phoneNumber, String email, String profession) throws IsNotFoundException {
        boolean isRun = false;
        for (int i = 0; i < docSize; i++) {
            if(doctor[i].getId().toLowerCase().equals(id.toLowerCase())){
                doctor[i].setName(name); doctor[i].setSurname(surname);
                doctor[i].setPhoneNumber(phoneNumber); doctor[i].setEmail(email); doctor[i].setProfession(profession);
                isRun = true;
            }
        }
        if(!isRun){
            throw new IsNotFoundException();
        }
    }

    public void printDoctors(){
        boolean isRun = false;
        for (int i = 0; i < docSize; i++) {
            System.out.println(i + ": " + doctor[i]);
            isRun = true;
        }
        if(!isRun){
            throw new IsNotFoundException();
        }
    }

    public Doctor searchPatientByDoctor(int pat){
        if(pat > docSize || pat < 0) {
            throw new IndexOutOfBoundsException();
        }
            return doctor[pat];
    }

    public void printAllPatientsByDoctor(String id) throws IsNotFoundException{
        boolean isRun = false;
        for (int i = 0; i < patSize; i++) {
            if(patient[i].getDoctor().getId().toLowerCase().equals(id)){
                System.out.println(patient[i]);
                isRun = true;
            }
        }
        if(!isRun){
            throw new IsNotFoundException();
        }
    }

    public void printAllPatients(){
        boolean isRun = false;
        for (int i = 0; i < patSize; i++) {
            System.out.println(i + ": " + patient[i]);
        }
    }

}