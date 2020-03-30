package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccessPrescriptionUIController implements Initializable{
    /**
     * Gets the prescriptions of the patient and displays them in the UI
     * @param patientID Uses the patientsID to find the prescriptions to display
     */
    
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/DoctorPrescriptionUIController.fxml"));
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
    public void displayPrescriptions(String patientID){
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
