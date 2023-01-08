import java.util.Date;

public class Doctor extends Person{
    private String medicalLicenseNumber;
    private String specialisation;

    public Doctor(String firstName, String surName, Date dateOfBirth, String mobileNumber, String medicalLicenseNumber, String specialisation) {
        super(firstName, surName, dateOfBirth, mobileNumber);
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialisation = specialisation;
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }


}
