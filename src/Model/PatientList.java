
package Model;


import java.util.ArrayList;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PatientList 
{
    private ArrayList <Patient> patientList = new ArrayList<>();
   
    public PatientList()
    {
        Date d = new Date();
        ArrayList<MedicalRecord> janeRecords = new ArrayList<>();
        
        ArrayList<Prescription> janePrescriptions = new ArrayList<>();
        Patient p = new Patient("Jane", "Doe", (d), "Sex", "Blood Type", "0", "SSN", "Insurance #", "CC", "Emergency Contacts", "Phone Number", "Email", janeRecords, "Relatives", "Address", "Billing Address", janePrescriptions);
        patientList.add(p);
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

   
    public void setUserList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
}