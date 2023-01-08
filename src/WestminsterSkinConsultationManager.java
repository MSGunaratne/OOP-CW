import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    // a static scanner instance to use for userInput
    static Scanner scanner = new Scanner(System.in);
    static int maximumNumberOfDoctorsAllowed = 10;
    //ArrayList to store all doctors in the system
    ArrayList<Doctor> doctorArrayList = new ArrayList<Doctor>();

    @Override
    public void addDoctor(ArrayList<Doctor> doctorArrayList, Doctor newDoctor) {

    }

    @Override
    public void deleteDoctor(ArrayList<Doctor> doctorArrayList, int licenseNumber) {

    }

    @Override
    public void showAllDoctors(ArrayList<Doctor> doctorArrayList) {

    }

    @Override
    public void saveInformation(ArrayList<Doctor> doctorArrayList) {

    }

    public static void main(String[] args) {
        System.out.println("----------------------Welcome----------------------");
        System.out.println("\t1. Add new doctor");
        System.out.println("\t2. Delete a doctor");
        System.out.println("\t3. Show All doctors");
        System.out.println("\t4. Save information to file");
        System.out.println();
        System.out.print("Enter required function: ");
        scanner.nextLine();
    }

}
