package ist412;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Tests.Test;
import Tests.kelliaTest;

/**
 *
 * @author Angel Wu
 */
public class IST412 extends Application {
    
   @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("LoginUI.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Please Login");
        stage.setScene(scene);
        stage.show();
    }
    
    //Test test= new Test();
//        test.testAll();
//        kelliaTest test2 = new kelliaTest();
//        test2.testAll();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
