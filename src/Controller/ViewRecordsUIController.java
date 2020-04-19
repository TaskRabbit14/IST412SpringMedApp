
package Controller;

import Model.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kelliacockerill
 */
public class ViewRecordsUIController implements Initializable {

    public Label firstName;
    public Label lastName;
    public Patient patient;
    
    public ViewRecordsUIController()
    {
      
        
    }
    
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/ViewRecord.fxml"));
        Scene scene = new Scene(root);
        scene.setRoot(root);
        stage.setTitle("View a Patient Record");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                     System.out.println("Error cannot open View Record UI");
                } 
    }
 
    
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

