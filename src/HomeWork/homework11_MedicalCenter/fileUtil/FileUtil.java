package HomeWork.homework11_MedicalCenter.fileUtil;

import HomeWork.homework11_MedicalCenter.medicalstorage.MedicalCenterStorage;
import HomeWork.homework11_MedicalCenter.persons.Doctor;
import HomeWork.homework11_MedicalCenter.persons.Patient;

import java.io.*;

public abstract class FileUtil {
    private static final String DOCTOR_DATA_FILE = "C:\\Users\\George\\IdeaProjects\\Java\\src\\HomeWork\\homework11_MedicalCenter\\data\\Doctor.txt";
    private static final String PATIENT_DATA_FILE = "C:\\Users\\George\\IdeaProjects\\Java\\src\\HomeWork\\homework11_MedicalCenter\\data\\Patient.txt";

    public static void serializeDoctorData(Doctor[] doctor,int size){

        try(
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE) )){
                objectOutputStream.writeInt(size);
            for (int i = 0; i < size; i++) {
              objectOutputStream.writeObject(doctor[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found input data" + e);
        } catch (IOException e) {
            System.out.println("fail to serialize data" + e);
        }
    }

    public static void serializePatientData(Patient[] patient, int size){

        try(ObjectOutputStream objectOutputStreams = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE) )){
            objectOutputStreams.writeInt(size);
            for (int i = 0; i < size; i++) {
            objectOutputStreams.writeObject(patient[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found input data" + e);
        } catch (IOException e) {
            System.out.println("fail to serialize data" + e);
        }
    }


    public static Doctor[] deseralizeDoctorData(){
        File file = new File(DOCTOR_DATA_FILE);
        if (!file.exists() || file.length() == 0) {
            return new Doctor[0];
        }
        try{
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE));
            int size = objectInputStream.readInt();
         Doctor[] arr = new Doctor[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (Doctor) objectInputStream.readObject();
            } return arr;
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static Patient[] deserializePatients() {
        File file = new File(PATIENT_DATA_FILE);
        if (!file.exists() || file.length() == 0) {
            return new Patient[0];
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            int size = ois.readInt();
            Patient[] arr = new Patient[size];

            for (int i = 0; i < size; i++) {
                arr[i] = (Patient) ois.readObject();
            }
            return arr;

        } catch (Exception e) {
            return new Patient[0];
        }
    }

    }














