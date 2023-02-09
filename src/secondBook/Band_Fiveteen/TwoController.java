/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Fiveteen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import report.DegreeCount;
import secondBook.Code.DraggableMaker;
import secondBook.Code.Rules;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class TwoController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void True1(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondM3lomat5();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_Fiveteen/Three.fxml", event);
    }

    @FXML
    private void False1(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Fiveteen/Three.fxml", event);
    }
    
}
