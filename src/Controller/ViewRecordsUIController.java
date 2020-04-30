
package Controller;

import Model.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kelliacockerill
 */
public class ViewRecordsUIController implements Initializable {
    
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}

