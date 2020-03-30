package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SendPrescriptionUIController {
    protected String selectedPatientID;
    
    /**
     * Creates a new object of class Prescription and adds it to the relevant patient's prescriptions
     * @param selectedPatientID Sets the ID of the patient whom is receiving the prescription (prescription is added to patient's arrayList, patientID is used in prescription constructor)
     */
    public void generatePrescription(String selectedPatientID){
        
    }
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/SendPrescriptionUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Medical Personell Homescreen");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                     System.out.println("Error cannot open Doctor Home UI");
                } 
    }
    /**
     * Sets selectedPatientID to the ID of the patient the Doctor is writing a prescription for
     */
    public void setSelectedPatient(){
        
    }
}
