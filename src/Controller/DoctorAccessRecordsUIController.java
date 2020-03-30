package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DoctorAccessRecordsUIController implements Initializable{
    
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
