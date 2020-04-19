package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UpdateRecordsUIController {
    
    AnchorPane currentRecordPane;
    Button editRecordName;
    Button editPrivacyRating;
    Button editFilePath;
    /**
     * Creates a MedicalRecord Object and adds it to the patient
     * @param patientID Sets the id to the record and adds it to the patient record
     */
   
    public void updatePatientRecord(String patientID)
    {
            System.out.println("Here to update....");
    }
    
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/UpdateRecordsUI.fxml"));
        Scene scene = new Scene(root);
        scene.setRoot(root);
        stage.setTitle("Update Patient Records");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                     System.out.println("Error cannot open Update RecordsUI");
                } 
    }
      
    public void initialize(URL location, ResourceBundle resources) 
    {
        
    }
    
    

}
