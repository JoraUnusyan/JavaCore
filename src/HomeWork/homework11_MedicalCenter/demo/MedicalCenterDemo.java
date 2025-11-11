package HomeWork.homework11_MedicalCenter.demo;


import FullLessons.lesson8.InHeritor3.Demo;
import HomeWork.homework11_MedicalCenter.medical_enums.Commands;
import HomeWork.homework11_MedicalCenter.medical_exceptions.IdDuplicateException;
import HomeWork.homework11_MedicalCenter.medical_exceptions.IsNotFoundException;
import HomeWork.homework11_MedicalCenter.medicalstorage.MedicalCenterStorage;
import HomeWork.homework11_MedicalCenter.persons.Doctor;
import HomeWork.homework11_MedicalCenter.persons.Patient;

import java.time.LocalDate;
import java.util.Scanner;

import static HomeWork.homework11_MedicalCenter.demo.DemoMethods.medicalCenterStorage;
import static HomeWork.homework11_MedicalCenter.demo.DemoMethods.scanner;

public class MedicalCenterDemo {
    public static void main(String[] args) {
        boolean isRun = true;
        while(isRun){
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    DemoMethods.addDoctor();
                    break;
                case "2":
                    DemoMethods.seaerchDoctorByPosition();
                    break;
                case "3":
                    DemoMethods.deleteDoctorByID();
                    break;
                case "4":
                    DemoMethods.ChangeDoctorById();
                    break;
                case "5":
                   DemoMethods.addPatient();
                   break;
                case "6":
                    DemoMethods.printAllPatientsByDoctor();
                    break;
                case "7":
                    medicalCenterStorage.printAllPatients();
                    break;
                case "8":
                  medicalCenterStorage.printDoctors();
                  break;
            }
        }




    }

}