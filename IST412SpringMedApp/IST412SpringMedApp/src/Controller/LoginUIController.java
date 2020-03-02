package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Angel Wu
 */
public class LoginUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Checks for username and password verification
     * @return A boolean for the if the password and username match
     */
    //@FMXL 
    public boolean verification(){
    
        return true;
    }
    
    /**
     * Redirects the Screen to DoctorHomeUI
     */
    public void toDoctorHomeUI(){
    
    }
    
    /**
     * Redirects the Screen to PatientHomeUI
     */
    public void toPatientHomeUI(){
    
    }
}
