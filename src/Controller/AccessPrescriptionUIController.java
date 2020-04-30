package Controller;

import Model.Patient;
import Model.PatientList;
import Model.Prescription;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AccessPrescriptionUIController implements Initializable{
    
    public TextField patientID;
    public Button viewPrescriptions;
    public TextField prescriptionID;
    public Button editPrescription;
    public Patient getPatient;
    public Prescription getPrescription;
    /**
     * Gets the prescriptions of the patient and displays them in the UI
     * @param patientID Uses the patientsID to find the prescriptions to display
     */
    
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/AccessPrescriptionUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Prescription Homescreen");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                     System.out.println("Error cannot open UI");
                } 
    }
   
    public void viewPrescriptions(ActionEvent event) throws IOException
    {
        // this is a get, not an undate -> change to load recorder
        PatientList list = new PatientList();
        ArrayList<Patient> patients= list.getPatientList();
        getPatient = null;
        for(Patient p : patients){
            if(p.getPatientID().equals(patientID.getText())){
                getPatient = p;
                break;
            }
            else
            {
                System.out.println("Patient doesnt match");
            }
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/ViewPrescription.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        //access the controller and call a method
        ViewPrescriptionUIController newController = loader.getController();
        newController.viewPrescription(getPatient);
        //getPatient sounds like function
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
     }

    public void editPrescription(ActionEvent event) throws IOException
    {

        PatientList list = new PatientList();
        ArrayList<Patient> patients= list.getPatientList();
        getPrescription = null;
        
        
        for(int i = 0; i < patients.size(); i++)
        {
            Patient p = patients.get(i);
            for(int j = 0; j < p.getPrescriptions().size(); j++)
            {
                if(p.getPrescriptions().get(i).equals(prescriptionID.getText()))
                {
                    getPrescription = p.getPrescriptions().get(i);
                    System.out.println("Found Prescription.");
                    break;
                }
            }
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/EditPrescription.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
  
        EditPrescriptionUIController newController = loader.getController();
        newController.editPrescription(getPrescription);
       
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
     }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
    }
}
