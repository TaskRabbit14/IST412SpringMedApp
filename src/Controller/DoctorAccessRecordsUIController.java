package Controller;

import Model.Patient;
import Model.PatientList;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DoctorAccessRecordsUIController implements Initializable{
    
    @FXML 
    private Button updateButton;
    @FXML 
    public TextField insertPatientID;
    @FXML
    public Button viewPatientRecords;
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
        stage.setTitle("Medical Personnel Homescreen");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                     System.out.println("Error cannot open Doctor Home UI");
                } 
    }
    
    
//    public void viewPatientRecords()
//    {
//        System.out.println(insertPatientID.getText());
//        PatientList list = new PatientList();
//        
//        if(list.searchPatientID(insertPatientID.getText()).getPatientID().equals(insertPatientID.getText()))
//        {
//            getPatient = list.searchPatientID(insertPatientID.getText()); 
//            System.out.println("Patient accessed: " + getPatient.getFirstName());
//
//            ViewRecordsUIController newController = new ViewRecordsUIController();
//            //newController.setPatient(getPatient);
////            newController.setFirstName(getPatient);
//
////                System.out.print (getPatient.getFirstName());
////                newController.firstName = new Label("This is a label");
//            newController.setStage((Stage)viewPatientRecords.getScene().getWindow());
//
//        }
//        else
//        {
//            System.out.println("Patient not found");
//        }         
//    }
    
    public void viewPatientRecords(ActionEvent event) throws IOException
    {
// this is a get, not an undate -> change to load recorder
        PatientList list = new PatientList();
        ArrayList<Patient> patients= list.getPatientList();
        getPatient = null;
        for(Patient p : patients){
            if(p.getPatientID().equals(insertPatientID.getText())){
                getPatient = p;
                break;
            }
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/ViewRecord.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller and call a method
        ViewRecordsUIController newController = loader.getController();
        newController.viewPatientRecord(getPatient);
        //getPatient sounds like function
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
     }
    
    public void updatePatientRecords(ActionEvent event) throws IOException
    {
// this is a get, not an undate -> change to load recorder
        PatientList list = new PatientList();
        ArrayList<Patient> patients= list.getPatientList();
        getPatient = null;
        for(Patient p : patients){
            if(p.getPatientID().equals(insertPatientID.getText())){
                getPatient = p;
                break;
            }
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/UpdateRecordsUI.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller and call a method
        UpdateRecordsUIController newController = loader.getController();
        newController.updatePatientRecord(getPatient);
        //getPatient sounds like function
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
     }

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        //todo
    }
}
