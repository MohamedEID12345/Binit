/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package firstBook.finallPage;

import firstBook.Band_Five.Band_FiveController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class ScoreController implements Initializable {

    @FXML
    private Label scoreDigit;
Band_FiveController bandfivecontroller=new Band_FiveController();
int result=0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        result=bandfivecontroller.countResult();
        scoreDigit.setText(String.valueOf(result));
        System.out.println(bandfivecontroller.countResult());
    }    

//    public ScoreController(Label scoreDigit) {
//        this.scoreDigit = scoreDigit;
//    }
    
}
