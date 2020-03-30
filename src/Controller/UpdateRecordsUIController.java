package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UpdateRecordsUIController {
    
    /**
     * Creates a MedicalRecord Object and adds it to the patient
     * @param patientID Sets the id to the record and adds it to the patient record
     */
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/UpdateRecordsUI.fxml"));
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
    public void updatePatientRecord(String patientID){
    
    }

}
