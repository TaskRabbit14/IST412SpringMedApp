/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kelliacockerill
 */
public class ViewPrescriptionUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void viewPrescription(Patient patient) 
    {
        System.out.println("Made it to view prescription method.");
        
    }
    
  
    
    public Patient patient;
    @FXML private AnchorPane currentRecordPane;
    @FXML private Label firstName;
    @FXML private Label lastName;
    @FXML private Label birthDate;
    @FXML private Label sex;
    @FXML private Label bloodType;
    @FXML private Label patientID;
    @FXML private Label SSN;
    
    public void viewPatientRecord(Patient p)
    {
            
        patient = p;
        System.out.println("Current Record: " + patient.getFullName());
        firstName.setText(patient.getFirstName());
        lastName.setText(patient.getLastName());
        birthDate.setText(patient.getBirthDate().toString());
        sex.setText(patient.getSex());
        bloodType.setText(patient.getBloodType());
        patientID.setText(patient.getPatientID());
        SSN.setText(patient.getSSN());
        
        

    }
    
//    public void setStage(Stage stage) 
//    {
//        try
//        {
//        Parent root = FXMLLoader.load(getClass().getResource("../View/ViewRecord.fxml"));
//        Scene scene = new Scene(root);
//        scene.setRoot(root);
//        stage.setTitle("View a Patient Record");
//        stage.setScene(scene);
//        stage.show();
//        }
//        catch(Exception e)
//                {
//                    e.printStackTrace();
//                     System.out.println("Error cannot open View Record UI");
//                } 
//    }
// 
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}
