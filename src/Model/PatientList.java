
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
        Patient p = new Patient("Jane", "Doe", (d), "F", "A", "0", "123513", "Insurance #", "CC", "Emergency Contacts", "Phone Number", "Email", janeRecords, "Relatives", "Address", "Billing Address", janePrescriptions);
        patientList.add(p);
//        Patient p2 = new Patient("John", "Doe", (d), "M", "O", "1", "SSN", "Insurance #", "CC", "Emergency Contacts", "Phone Number", "Email", janeRecords, "Relatives", "Address", "Billing Address", janePrescriptions);
//        patientList.add(p2);
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

   
    public void setUserList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient searchPatientID(String ID){
        Patient patient = new Patient();
        for (int i=0; i<patientList.size(); i++){
            if(patientList.get(i).getPatientID().equals(ID)){
                patient = patientList.get(i);
            }
        }
        return patient;
    }
    
}
