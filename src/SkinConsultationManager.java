import java.util.ArrayList;

public interface SkinConsultationManager {
    void addDoctor(ArrayList<Doctor> doctorArrayList, Doctor newDoctor);
    void deleteDoctor(ArrayList<Doctor> doctorArrayList, int licenseNumber);
    void showAllDoctors(ArrayList<Doctor> doctorArrayList);
    void saveInformation(ArrayList<Doctor> doctorArrayList);
}
