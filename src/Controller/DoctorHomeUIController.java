package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Angel Wu
 */
public class DoctorHomeUIController implements Initializable {
    @FXML
    private Button homeNav;
    @FXML
    private Button prescriptionNav;
    @FXML
    private Button recordNav;
    /**
     * Initializes the controller class.
     */
    public void setStage(Stage stage) 
    {
        try
        {
        Parent root = FXMLLoader.load(getClass().getResource("../View/DoctorHomeUI.fxml"));
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
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Redirects the Screen to DoctorAccessRecordsUI
     */
    public void toDoctorAccessRecordsUI(){
    
    }
    
    /**
     * Redirects the Screen to DoctorUpdateRecordsUI
     */
    public void toDoctorUpdateRecordsUI(){
    
    }
    
    /**
     * Redirects the Screen to SendPrescriptionUI
     */
    public void toSendPrescriptionUI(){
    
    }
    
    /**
     * Redirects the Screen to AccessPrescriptionUI
     */
    public void toAccessPrescriptionUI(){
    
    }
    
    public void home(){
        DoctorHomeUIController newController = new DoctorHomeUIController();
        newController.setStage((Stage)homeNav.getScene().getWindow());
    }
    
    public void record(){
        DoctorAccessRecordsUIController newController = new DoctorAccessRecordsUIController();
        newController.setStage((Stage)homeNav.getScene().getWindow());
    }
    
    public void prescription(){
        AccessPrescriptionUIController newController = new AccessPrescriptionUIController();
        newController.setStage((Stage)homeNav.getScene().getWindow());
    }
}
