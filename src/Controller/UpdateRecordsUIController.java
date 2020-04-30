package Controller;

import Model.Patient;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UpdateRecordsUIController implements Initializable {

    public Patient patient;
    @FXML private AnchorPane currentRecordPane;
    @FXML private Button editRecordName;
    @FXML private Button editPrivacyRating;
    @FXML private Button editFilePath;
    @FXML private Label patientRecord;
    @FXML public TextField firstName;
    @FXML public TextField lastName;


    /**
     * Creates a MedicalRecord Object and adds it to the patient
     * @param p Sets the id to the record and adds it to the patient record
     */
   
    public void updatePatientRecord(Patient p)
    {
            if(p == null)
            {
                System.out.println("Patient not found");
                patientRecord.setText("Patient not found");
            }
            else
            {
                patient = p;
                System.out.println("Current Record: " + patient.getFullName());
                patientRecord.setText("Current Record: " + patient.getFullName());
            }
        System.out.println("Here to update....");
    }
    
    public void onClickEditName(ActionEvent event) throws IOException
    {
        patient.setFirstName(firstName.getText());
        patient.setLastName(lastName.getText());
        patientRecord.setText("Current Record: " + patient.getFullName());
    }
    public void OnClickBack(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/DoctorAccessRecordsUI.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller and call a method
        DoctorAccessRecordsUIController newController = loader.getController();
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    @Override  
    public void initialize(URL location, ResourceBundle resources) 
    {
        
    }
    
}
