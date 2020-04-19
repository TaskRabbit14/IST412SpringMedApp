package Controller;

import Model.Patient;
import Model.PatientList;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DoctorAccessRecordsUIController implements Initializable{
    
    public Button updatePatientRecords;
    public TextField insertPatientID;
    public Patient getPatient;
    
    
    /**
     * Gets the records of the patient and displays them in the UI
     * @param patientID Uses the patientsID to find the records to display
     */
    public void displayRecords(String patientID){
    }
    
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/DoctorAccessRecordsUI.fxml"));
        Scene scene = new Scene(root);
        scene.setRoot(root);
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
    
    
    public void viewPatientRecords()
    {
        System.out.println(insertPatientID.getText());
        PatientList list = new PatientList();
        ArrayList<Patient> x = list.getPatientList();
        
        for(int i = 0; i < x.size(); i++)
        {
            if(x.get(i).getPatientID().equals(insertPatientID.getText()))
            {
                getPatient = x.get(i); 
                System.out.println("Patient accessed: " + getPatient.getFirstName());
                
                ViewRecordsUIController newController = new ViewRecordsUIController();
                newController.setPatient(getPatient);
                newController.setStage((Stage)updatePatientRecords.getScene().getWindow());
                
            }
            else
            {
                System.out.println("Patient not found");
            }
        }
         
    }
    
    public void updatePatientRecords()
    {
        UpdateRecordsUIController newController = new UpdateRecordsUIController();
        newController.setStage((Stage)updatePatientRecords.getScene().getWindow());
        newController.updatePatientRecord(insertPatientID.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        
    }
}
