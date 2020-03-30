package Controller;

import Model.UserList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Angel Wu
 */
public class LoginUIController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private TextField logInID;
    @FXML
    private PasswordField password;
    @FXML
    private Button go;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  
    @FXML
    public void goPressed() {
        System.out.println("Submit!");
       UserList list = new UserList();
        if (list.authenticate(logInID, password) == true && logInID.getText().equals("DRtest"))
            { 
                
                label.setText("Valid- Medical Personell.");
                DoctorHomeUIController newController = new DoctorHomeUIController();
                newController.setStage((Stage)label.getScene().getWindow());
               
            }
        else 
            {
                label.setText("Invalid. Try again.");
            }
        
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
