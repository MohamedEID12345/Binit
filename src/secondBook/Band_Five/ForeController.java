/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package secondBook.Band_Five;

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
public class ForeController implements Initializable {

    @FXML
    private RadioButton true1;
    @FXML
    private ToggleGroup band;
    @FXML
    private RadioButton false1;
    @FXML
    private ImageView triangle2;
    @FXML
    private ImageView triangle1;
    @FXML
    private ImageView square2;
    @FXML
    private ImageView square1;
    @FXML
    private ImageView circle;
DraggableMaker draggablemaker = new DraggableMaker();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draggablemaker.makeDraggable(triangle1);
        draggablemaker.makeDraggable(triangle2); 
        draggablemaker.makeDraggable(square1);
        draggablemaker.makeDraggable(square2);
        draggablemaker.makeDraggable(circle); 
    }    

    @FXML
    private void True(ActionEvent event) {
        DegreeCount score = new DegreeCount();
        score.secondMo3lga2();
        score.firstOneVal();
        Rules rules = new Rules();
        rules.back();
        draggablemaker.trueAction("/secondBook/Band_Five/Five.fxml", event);
    }

    @FXML
    private void False(ActionEvent event) {
        draggablemaker.falseAction("/secondBook/Band_Five/Five.fxml", event);
    }
    
}
