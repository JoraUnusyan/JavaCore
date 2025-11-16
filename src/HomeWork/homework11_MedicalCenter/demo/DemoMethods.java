package HomeWork.homework11_MedicalCenter.demo;

import HomeWork.homework11_MedicalCenter.fileUtil.FileUtil;
import HomeWork.homework11_MedicalCenter.medical_exceptions.IdDuplicateException;
import HomeWork.homework11_MedicalCenter.medical_exceptions.IsNotFoundException;
import HomeWork.homework11_MedicalCenter.medicalstorage.MedicalCenterStorage;
import HomeWork.homework11_MedicalCenter.persons.Doctor;
import HomeWork.homework11_MedicalCenter.persons.Patient;


import java.time.LocalDate;
import java.util.Scanner;

public class DemoMethods {

    public static Scanner scanner = new Scanner(System.in);
    public static MedicalCenterStorage medicalCenterStorage = new MedicalCenterStorage();

    public static Doctor saveDoctorInfo(){
        System.out.println("Введите ID доктора ");
        String docID = scanner.nextLine();
        System.out.println("Введите имя Доктора ");
        String docName = scanner.nextLine();
        System.out.println("Введите фамилию Доктора");
        String docSurName = scanner.nextLine();
        System.out.println("Введите номер телефона Доктора");
        String docPhoneNumber = scanner.nextLine();
        System.out.println("Введите Email Доктора ");
        String docEmail = scanner.nextLine();
        System.out.println("Введите профессию Доктора ");
        String docProfession = scanner.nextLine();
        return new Doctor(docID, docName, docSurName, docPhoneNumber, docEmail, docProfession);
    }

    public static void addDoctor(){
        Doctor doctor = saveDoctorInfo();
        try {
            medicalCenterStorage.addDoctor(doctor);
            System.out.println("Доктор был успешно добавлен в список");
        } catch (IdDuplicateException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void addPatient(){
        System.out.println("Введите ID пациента");
        String patID = scanner.nextLine();
        System.out.println("Введите имя пациента");
        String patName = scanner.nextLine();
        System.out.println("Введите фамилию пациента");
        String patSurname = scanner.nextLine();
        System.out.println("Введите номер телефона пацинета");
        String patPhoneNumber = scanner.nextLine();
        System.out.println("Выберите у какого доктора будет записан пациент");

        boolean run = false;
        LocalDate localdate = LocalDate.now();
        do{
            try{
                medicalCenterStorage.printDoctors();
                int patientByDoctor = Integer.parseInt(scanner.nextLine());
                Doctor pat = medicalCenterStorage.searchPatientByDoctor(patientByDoctor);
                Patient patient = new Patient(patID, patName, patSurname, patPhoneNumber, pat, localdate);
                try{
                    medicalCenterStorage.addPatient(patient);
                    System.out.println("Пациент был успешно добавлен в список");
                } catch (IdDuplicateException e){
                    System.out.println(e.getMessage());
                }

                run = true;
            } catch(NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Попробуйте снова, введите корректное число");
            }
        } while(!run);




    }

    public static void seaerchDoctorByPosition(){
        boolean repeat = false;
        do{
            System.out.println("Введите должность Доктора для поиска");
            String position = scanner.nextLine();
            try{medicalCenterStorage.searchDoctorByProfession(position);
                System.out.println("Доктор был успешно найден: ");
                repeat = true;}
            catch(IsNotFoundException e) {
                System.out.println("Попробуйте снова");
            }
        } while(!repeat);
    };

    public static void deleteDoctorByID(){
        boolean repeat = false;
        do{
            System.out.println("Введите ID доктора которого нужно удалить из списка");
            String delete = scanner.nextLine();
            try{
                medicalCenterStorage.deleteDoctorById(delete);
                System.out.println("Доктор был успешно удален из списка");
                repeat = true;
            } catch(IsNotFoundException e) {
                System.out.println("Попробуйте снова");
            }
        } while(!repeat);

    }

    public static void ChangeDoctorById(){
        boolean repeat = false;
        do{
            System.out.println("Введите ID доктора, данные которого хотите изменить");
            String id = scanner.nextLine();
            System.out.println("Введите новое имя");
            String newname = scanner.nextLine();
            System.out.println("Введите новую фамилию");
            String newSurName = scanner.nextLine();
            System.out.println("Введите новый номер телефона доктора");
            String newPhoneNumber = scanner.nextLine();
            System.out.println("Введите новый Email доктора");
            String newEmail = scanner.nextLine();
            System.out.println("Введите новую профессию доктора ");
            String newProfession = scanner.nextLine();
            try{
                medicalCenterStorage.changeDoctorById(id, newname, newSurName, newPhoneNumber, newEmail, newProfession);
                System.out.println("Данные доктора были изменены");
                repeat = true;
            } catch(IsNotFoundException e){
                System.out.println("Попробуйте снова");
            }
        } while(!repeat);
    }

    public static void printAllPatientsByDoctor(){
        boolean repeat = false;
        do{
            System.out.println("Введите ID доктора, чтобы получить список его пациентов");
            String id = scanner.nextLine();
            try{
                medicalCenterStorage.printAllPatientsByDoctor(id);
                System.out.println("Список пациентов доктора: ");
                repeat = true;
            } catch(IsNotFoundException e){
                System.out.println(e.getMessage());
            }

        } while(!repeat);
    }

}
