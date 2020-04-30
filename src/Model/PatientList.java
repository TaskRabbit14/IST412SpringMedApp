
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
        
        ArrayList<MedicalRecord> janeRecords = new ArrayList<MedicalRecord>();
        janeRecords.add( new MedicalRecord("recordID","recordName","PatientID", 0 , new Date(2020,3,12),"filepath"));
        
        ArrayList<Prescription> janePrescriptions = new ArrayList<Prescription>();
        
        ArrayList<String> janeMedicineList = new ArrayList<String>();
        janeMedicineList.add("Carboplatin");
        ArrayList<String> janeDosageList = new ArrayList<String>();
        janeMedicineList.add("1 every day for 3 months");
        janePrescriptions.add(new Prescription("2018/3/11", janeMedicineList, janeDosageList , "1", "0", "1", "Notes here"));
        
        Date janeDOB = new Date(1990,5,12);
        Patient jane = new Patient("Jane", "Doe", janeDOB, "F", "A", "0", "123513112", "Insurance #", "6000770011218800", "91744443333", "9176643344", "JaneDoe@email.com", janeRecords, "Sarah Doe", "7110 East Roosevelt St., West Islip, NY 11795", "7110 East Roosevelt St., West Islip, NY 11795", janePrescriptions);
        
        
        
        
        ArrayList<MedicalRecord> samuelRecords = new ArrayList<MedicalRecord>();
        samuelRecords.add( new MedicalRecord("recordID","recordName","PatientID", 0 , new Date(2020,3,12),"filepath"));
        
        ArrayList<Prescription> samuelPrescriptions = new ArrayList<Prescription>();
        
        ArrayList<String> samuelMedicineList = new ArrayList<String>();
        samuelMedicineList.add("Doxil");
        ArrayList<String> samuelDosageList = new ArrayList<String>();
        samuelMedicineList.add("2 every day for 1 Month");
        samuelPrescriptions.add(new Prescription("2012/8/19", samuelMedicineList, samuelDosageList , "1", "0", "1", "Notes here"));
        
        Date samuelDOB = new Date(1948,12,21);
        Patient samuel = new Patient("Samuel", "Jackson", samuelDOB, "M", "O-", "1", "867513556", "Insurance #", "7321670089000001", "6103322777", "6107889885", "SamuelJ@email.com", samuelRecords, "James Jackson", "8399 Center Ave., State College, PA 16801", "8399 Center Ave., State College, PA 16801", samuelPrescriptions);
        
        
        
        
        ArrayList<MedicalRecord> lerroyRecords = new ArrayList<MedicalRecord>();
        lerroyRecords.add( new MedicalRecord("recordID","recordName","PatientID", 0 , new Date(2020,3,12),"filepath"));
        
        
        ArrayList<Prescription> lerroyPrescriptions = new ArrayList<Prescription>();
        ArrayList<String> lerroyMedicineList = new ArrayList<String>();
        lerroyMedicineList.add("Aspirin");
        ArrayList<String> lerroyDosageList = new ArrayList<String>();
        lerroyMedicineList.add("2 every day for 3 days");
        lerroyPrescriptions.add(new Prescription("2020/4/18", lerroyMedicineList, lerroyDosageList , "1", "0", "1", "Notes here"));

        Date lerroyDOB = new Date(2000,1,27);
        
        Patient lerroy = new Patient("Lerroy", "Smith", lerroyDOB, "M", "AB-", "2", "443513556", "Insurance #", "3326786694000000", "2670033555", "2678798000", "LerroyS@email.com", lerroyRecords, "None", "7021 SE. Homewood St., Gibsonia, PA 15044", "7021 SE. Homewood St., Gibsonia, PA 15044", lerroyPrescriptions);
        
        
        
        patientList.add(jane);
        patientList.add(samuel);
        patientList.add(lerroy);
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
