import java.util.Date;

public class Consultation {
    private Doctor consultantDoctor;
    private Patient patient;
    private Date date;
    private int cost;
    private String notes;

    public Consultation(Doctor consultantDoctor, Patient patient, Date date, int cost, String notes) {
        this.consultantDoctor = consultantDoctor;
        this.patient = patient;
        this.date = date;
        this.cost = cost;
        this.notes = notes;
    }

    public Doctor getConsultantDoctor() {
        return consultantDoctor;
    }

    public void setConsultantDoctor(Doctor consultantDoctor) {
        this.consultantDoctor = consultantDoctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
