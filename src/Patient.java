import java.util.Date;
import java.util.UUID;

public class Patient extends Person{
    private UUID patientId;

    public Patient(String firstName, String surName, Date dateOfBirth, String mobileNumber) {
        super(firstName, surName, dateOfBirth, mobileNumber);
        this.patientId = UUID.randomUUID();
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }
}
