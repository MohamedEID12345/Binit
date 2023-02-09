/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Six;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import report.DegreeCount;
import secondBook.Code.DraggableMaker;
import secondBook.Code.Rules;

/**
 * FXML Controller class
 *
 * @author eid
 */
public class FourController implements Initializable {

    @FXML
    private ImageView square1;
    @FXML
    private ImageView square2;
    @FXML
    private ImageView square3;
    @FXML
    private ImageView square4;
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
        draggablemaker.makeDraggable(square1);
        draggablemaker.makeDraggable(square2); 
        draggablemaker.makeDraggable(square3);
        draggablemaker.makeDraggable(square4); 
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondZakera2();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_Six/Five.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Six/Five.fxml", event);
    }
    
}
