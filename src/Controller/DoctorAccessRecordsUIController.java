package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DoctorAccessRecordsUIController {
    
    /**
     * Gets the records of the patient and displays them in the UI
     * @param patientID Uses the patientsID to find the records to display
     */
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/DoctorAccessRecordsUI.fxml"));
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
    public void displayRecords(String patientID){
    }
}
